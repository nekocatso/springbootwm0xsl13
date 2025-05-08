;(function($, window, document,undefined) {

    var Code = function(ele, opt) {
        this.$element = ele,
        this.defaults = {
        	type : 1,
        	figure : 100,
        	arith : 0,
        	width : '200px',
		    height : '60px',
		    fontSize : '30px',
        	codeLength : 6,
        	btnId : 'check-btn',
        	ready : function(){},
        	success : function(){},
            error : function(){}
        },
        this.options = $.extend({}, this.defaults, opt)
    };

    var _code_chars = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'];
    var _code_color1 = ['#fffff0', '#f0ffff', '#f0fff0', '#fff0f0'];
    var _code_color2 = ['#FF0033', '#006699', '#993366', '#FF9900', '#66CC66', '#FF33CC'];

    Code.prototype = {
    	init : function() {

			var _this = this;

			this.loadDom();
			this.setCode();

			this.options.ready();

			this.$element[0].onselectstart = document.body.ondrag = function(){
				return false;
			};

			this.$element.find('.verify-code, .verify-change-code').on('click', function() {
				_this.setCode();
			});

			this.htmlDoms.code_btn.on('click', function() {
				_this.checkCode();
			})

    	},

    	loadDom : function() {
    		var panelHtml = '<div class="cerify-code-panel"><div class="verify-code"></div><div class="verify-code-area"><div class="verify-input-area"><input type="text" class="varify-input-code" /></div><div class="verify-change-area"><a class="verify-change-code">换一张</a></div></div></div>';
        	this.$element.append(panelHtml);

        	this.htmlDoms = {
        		code_btn : $('#'+this.options.btnId),
        		code : this.$element.find('.verify-code'),
        		code_area : this.$element.find('.verify-code-area'),
        		code_input : this.$element.find('.varify-input-code'),
        	};

        	this.htmlDoms.code.css({'width':this.options.width, 'height':this.options.height,'line-height':this.options.height, 'font-size':this.options.fontSize});
        	this.htmlDoms.code_area.css({'width':this.options.width});
    	},


    	setCode : function() {

    		var color1Num = Math.floor(Math.random() * 3);
    		var color2Num = Math.floor(Math.random() * 5);

    		this.htmlDoms.code.css({'background-color': _code_color1[color1Num], 'color': _code_color2[color2Num]});
    		this.htmlDoms.code_input.val('');

    		var code = '';
    		this.code_chose = '';

    		if(this.options.type == 1) {
				for(var i = 0; i < this.options.codeLength; i++) {
					var charNum = Math.floor(Math.random() * 52);
					var tmpStyle = (charNum%2 ==0)? "font-style:italic;margin-right: 10px;":"font-weight:bolder;";
					tmpStyle += (Math.floor(Math.random() * 2) == 1)? "font-weight:bolder;":"";

					this.code_chose += _code_chars[charNum];
					code += '<font style="'+tmpStyle+'">'+_code_chars[charNum]+'</font>';
				}
    		}else {

    			var num1 = Math.floor(Math.random() * this.options.figure);
    			var num2 = Math.floor(Math.random() * this.options.figure);

    			if(this.options.arith == 0) {
    				var tmparith = Math.floor(Math.random() * 3);
    			}

    			switch(tmparith) {
    				case 1 :
    					this.code_chose = parseInt(num1) + parseInt(num2);
    					code = num1 + ' + ' + num2 + ' = ?';
    					break;
    				case 2 :
    					if(parseInt(num1) < parseInt(num2)) {
    						var tmpnum = num1;
    						num1 = num2;
    						num2 = tmpnum;
    					}
    					this.code_chose = parseInt(num1) - parseInt(num2);
    					code = num1 + ' - ' + num2 + ' = ?';
    					break;
    				default :
    					this.code_chose = parseInt(num1) * parseInt(num2);
    					code = num1 + ' × ' + num2 + ' = ?';
    					break;
    			}
    		}

    		this.htmlDoms.code.html(code);

    	},

    	checkCode : function() {
    		if(this.options.type == 1) {
    			var own_input = this.htmlDoms.code_input.val().toUpperCase();
    			this.code_chose = this.code_chose.toUpperCase();
    		}else {
    			var own_input = this.htmlDoms.code_input.val();
    		}

    		if(own_input == this.code_chose) {
    			this.options.success();
    		}else {
    			this.options.error();
    			this.setCode();
    		}
    	}
    };


    var Slide = function(ele, opt) {
        this.$element = ele,
        this.defaults = {

        	type : 1,
        	vOffset: 5,
            vSpace : 5,
            imgName : ['1.jpg', '2.jpg'],
            imgSize : {
	        	width: '400px',
	        	height: '200px',
	        },
	        blockSize : {
	        	width: '50px',
	        	height: '50px',
	        },
	        barSize : {
	        	width : '400px',
	        	height : '40px',
	        },
            ready : function(){},
        	success : function(){},
            error : function(){}

        },
        this.options = $.extend({}, this.defaults, opt)
    };


    Slide.prototype = {

        init: function() {
        	var _this = this;

        	this.loadDom();
        	this.options.ready();

        	this.$element[0].onselectstart = document.body.ondrag = function(){
				return false;
			};

        	this.htmlDoms.move_block.on('touchstart', function(e) {
        		_this.start(e);
        	});

        	this.htmlDoms.move_block.on('mousedown', function(e) {
        		_this.start(e);
        	});

            window.addEventListener("touchmove", function(e) {
            	_this.move(e);
            });
            window.addEventListener("mousemove", function(e) {
            	_this.move(e);
            });

            window.addEventListener("touchend", function() {
            	_this.end();
            });
            window.addEventListener("mouseup", function() {
            	_this.end();
            });

            _this.$element.find('.verify-refresh').on('click', function() {
            	_this.refresh();
            });
        },

        loadDom : function() {
        	this.img_rand = Math.floor(Math.random() * this.options.imgName.length);

        	var panelHtml = '';
        	var tmpHtml = '';

        	if(this.options.type != 1) {
        		panelHtml += '<div class="verify-img-panel"><div  class="verify-refresh"><span class="icon iconfont icon-shuaxin"></span></div><div style="position: relative;z-index: 2;border: 1px solid #fff;background: #fff;" class="verify-gap"></div></div>';
        		tmpHtml = '<div style="position: absolute;text-align: center;z-index: 3;border: 1px solid #fff;" class="verify-sub-block"></div>';
        	}

        	panelHtml += '<div class="verify-bar-area"><span  class="verify-msg">向右滑动完成验证</span><div class="verify-left-bar"><span  class="verify-msg"></span><div  class="verify-move-block"><i class="icon iconfont verify-icon icon-jinru"></i>'+tmpHtml+'</div></div></div>';
        	this.$element.append(panelHtml);

        	this.htmlDoms = {
        		gap : this.$element.find('.verify-gap'),
        		sub_block : this.$element.find('.verify-sub-block'),
        		img_panel : this.$element.find('.verify-img-panel'),
        		bar_area : this.$element.find('.verify-bar-area'),
        		move_block : this.$element.find('.verify-move-block'),
        		left_bar : this.$element.find('.verify-left-bar'),
        		msg : this.$element.find('.verify-msg'),
        		icon : this.$element.find('.verify-icon'),
        		refresh :this.$element.find('.verify-refresh')
        	};

        	this.status = false;
        	this.setSize = this.resetSize(this);

        	this.htmlDoms.gap.css({'width': this.options.blockSize.width, 'height': this.options.blockSize.height});
        	this.htmlDoms.sub_block.css({'width': this.options.blockSize.width, 'height': this.options.blockSize.height});
        	this.htmlDoms.img_panel.css({'width': this.setSize.img_width, 'height': this.setSize.img_height, 'background': 'url('+this.options.imgName[this.img_rand]+')', 'background-size' : this.setSize.img_width + ' '+ this.setSize.img_height});
        	this.htmlDoms.bar_area.css({'width': this.setSize.bar_width, 'height': this.options.barSize.height, 'line-height':this.options.barSize.height});
        	this.htmlDoms.move_block.css({'width': this.options.barSize.height, 'height': this.options.barSize.height});
        	this.htmlDoms.left_bar.css({'width': this.options.barSize.height, 'height': this.options.barSize.height});

        	this.randSet();
        },

        start: function(e) {
        	this.htmlDoms.msg.text('');
        	this.htmlDoms.move_block.css('background-color', '#337ab7');
          this.htmlDoms.left_bar.addClass('verify-left-bar-active');
        	this.htmlDoms.icon.css('color', '#fff');
        	e.stopPropagation();
        	this.status = true;

        },

        move: function(e) {
        	if(this.status) {
	            if(!e.touches) {
	                var x = e.clientX;
	            }else {
	                var x = e.touches[0].pageX;
	            }
	            var bar_area_left = Slide.prototype.getLeft(this.htmlDoms.bar_area[0]);
	            var move_block_left = x - bar_area_left;


	            if(this.options.type != 1) {
	            	if(move_block_left >= this.htmlDoms.bar_area[0].offsetWidth - parseInt(parseInt(this.options.blockSize.width)/2) - 2) {
	                	move_block_left = this.htmlDoms.bar_area[0].offsetWidth - parseInt(parseInt(this.options.blockSize.width)/2) - 2;
	            	}
	            }else {
	            	if(move_block_left >= this.htmlDoms.bar_area[0].offsetWidth - parseInt(parseInt(this.options.barSize.height)/2) + 3) {
	            		this.$element.find('.verify-msg:eq(1)').text('松开验证');
	                	move_block_left = this.htmlDoms.bar_area[0].offsetWidth - parseInt(parseInt(this.options.barSize.height)/2) + 3;
	            	}else {
	            		this.$element.find('.verify-msg:eq(1)').text('');
	            	}
	            }


	            if(move_block_left <= 0) {
            		move_block_left = parseInt(parseInt(this.options.blockSize.width)/2);
            	}

	            this.htmlDoms.move_block.css('left', move_block_left-parseInt(parseInt(this.options.blockSize.width)/2) + "px");
	            this.htmlDoms.left_bar.css('width', move_block_left-parseInt(parseInt(this.options.blockSize.width)/2) + "px");
	        }
        },

        end: function() {

        	var _this = this;

        	if(this.status) {

        		if(this.options.type != 1) {

        			var vOffset = parseInt(this.options.vOffset);
		            if(parseInt(this.htmlDoms.gap.css('left')) >= (parseInt(this.htmlDoms.move_block.css('left')) - vOffset) && parseInt(this.htmlDoms.gap.css('left')) <= (parseInt(this.htmlDoms.move_block.css('left')) + vOffset)) {
		            	this.htmlDoms.move_block.css('background-color', '#5cb85c');
                  this.htmlDoms.left_bar.addClass('verify-left-bar-success');
		            	this.htmlDoms.icon.css('color', '#fff');
		            	this.htmlDoms.icon.removeClass('icon-jinru');
		            	this.htmlDoms.icon.addClass('icon-dagou');
		            	this.htmlDoms.refresh.hide();
		            	this.htmlDoms.move_block.unbind('mousedown touchstart');
		            	this.options.success();
		            }else{
		            	this.htmlDoms.move_block.css('background-color', '#d9534f');
                  this.htmlDoms.left_bar.addClass('verify-left-bar-error');
		            	this.htmlDoms.icon.css('color', '#fff');
		            	this.htmlDoms.icon.removeClass('icon-jinru');
		            }

        		}else {…}
        	}
        },


        resetSize : function(obj) {…},
        randSet: function() {…},
        refresh: function() {…},
        getLeft: function(node) {…}
    };

})(jQuery, window, document);
