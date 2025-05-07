<template>
	<div class="addEdit-block" :style='{"minHeight":"calc(100vh - 200px)","padding":"0px","margin":"0 auto","color":"#666","background":"none","width":"calc(100% - 60px)","fontSize":"16px","height":"100%"}'>
		<el-form
			:style='{"border":"1px solid #ceddee","padding":"30px 10%","boxShadow":"inset 0px 0px 32px 0px #E8EFF7,0 3px 6px 0px rgba(100,100,100,.1)","borderColor":"#ceddee","alignItems":"flex-start","borderRadius":"8px","flexWrap":"wrap","background":"rgba(255,255,255,.9)","borderWidth":"1px","display":"flex","fontSize":"inherit","borderStyle":"double"}'
			class="add-update-preview"
			ref="ruleForm"
			:model="ruleForm"
			:rules="rules"
			label-width="200px"
		>
			<template >
				<el-form-item :style='{"padding":"2px 0","margin":"0 auto 10px","color":"inherit","borderRadius":"4px","background":"none","width":"100%","fontSize":"inherit"}' class="input" v-if="type!='info'"  label="货物名称" prop="huowumingcheng">
					<el-input v-model="ruleForm.huowumingcheng" placeholder="货物名称" clearable  :readonly="ro.huowumingcheng"></el-input>
				</el-form-item>
				<el-form-item :style='{"padding":"2px 0","margin":"0 auto 10px","color":"inherit","borderRadius":"4px","background":"none","width":"100%","fontSize":"inherit"}' v-else class="input" label="货物名称" prop="huowumingcheng">
					<el-input v-model="ruleForm.huowumingcheng" placeholder="货物名称" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"padding":"2px 0","margin":"0 auto 10px","color":"inherit","borderRadius":"4px","background":"none","width":"100%","fontSize":"inherit"}' class="input" v-if="type!='info'"  label="货物类型" prop="huowuleixing">
					<el-input v-model="ruleForm.huowuleixing" placeholder="货物类型" clearable  :readonly="ro.huowuleixing"></el-input>
				</el-form-item>
				<el-form-item :style='{"padding":"2px 0","margin":"0 auto 10px","color":"inherit","borderRadius":"4px","background":"none","width":"100%","fontSize":"inherit"}' v-else class="input" label="货物类型" prop="huowuleixing">
					<el-input v-model="ruleForm.huowuleixing" placeholder="货物类型" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"padding":"2px 0","margin":"0 auto 10px","color":"inherit","borderRadius":"4px","background":"none","width":"100%","fontSize":"inherit"}' class="input" v-if="type!='info'"  label="规格" prop="guige">
					<el-input v-model="ruleForm.guige" placeholder="规格" clearable  :readonly="ro.guige"></el-input>
				</el-form-item>
				<el-form-item :style='{"padding":"2px 0","margin":"0 auto 10px","color":"inherit","borderRadius":"4px","background":"none","width":"100%","fontSize":"inherit"}' v-else class="input" label="规格" prop="guige">
					<el-input v-model="ruleForm.guige" placeholder="规格" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"padding":"2px 0","margin":"0 auto 10px","color":"inherit","borderRadius":"4px","background":"none","width":"100%","fontSize":"inherit"}' class="input" v-if="type!='info'"  label="库存量" prop="shuliang">
					<el-input v-model.number="ruleForm.shuliang" placeholder="库存量" clearable  :readonly="ro.shuliang"></el-input>
				</el-form-item>
				<el-form-item :style='{"padding":"2px 0","margin":"0 auto 10px","color":"inherit","borderRadius":"4px","background":"none","width":"100%","fontSize":"inherit"}' v-else class="input" label="库存量" prop="shuliang">
					<el-input v-model="ruleForm.shuliang" placeholder="库存量" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"padding":"2px 0","margin":"0 auto 10px","color":"inherit","borderRadius":"4px","background":"none","width":"100%","fontSize":"inherit"}' class="input" v-if="type!='info'"  label="盘点数量" prop="pandianshuliang">
					<el-input v-model.number="ruleForm.pandianshuliang" placeholder="盘点数量" clearable  :readonly="ro.pandianshuliang"></el-input>
				</el-form-item>
				<el-form-item :style='{"padding":"2px 0","margin":"0 auto 10px","color":"inherit","borderRadius":"4px","background":"none","width":"100%","fontSize":"inherit"}' v-else class="input" label="盘点数量" prop="pandianshuliang">
					<el-input v-model="ruleForm.pandianshuliang" placeholder="盘点数量" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"padding":"2px 0","margin":"0 auto 10px","color":"inherit","borderRadius":"4px","background":"none","width":"100%","fontSize":"inherit"}' class="date" v-if="type!='info'" label="盘点时间" prop="pandianshijian">
					<el-date-picker
						format="yyyy 年 MM 月 dd 日"
						value-format="yyyy-MM-dd"
						v-model="ruleForm.pandianshijian" 
						type="date"
						:readonly="ro.pandianshijian"
						placeholder="盘点时间"
					></el-date-picker> 
				</el-form-item>
				<el-form-item :style='{"padding":"2px 0","margin":"0 auto 10px","color":"inherit","borderRadius":"4px","background":"none","width":"100%","fontSize":"inherit"}' class="input" v-else-if="ruleForm.pandianshijian" label="盘点时间" prop="pandianshijian">
					<el-input v-model="ruleForm.pandianshijian" placeholder="盘点时间" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"padding":"2px 0","margin":"0 auto 10px","color":"inherit","borderRadius":"4px","background":"none","width":"100%","fontSize":"inherit"}' class="input" v-if="type!='info'"  label="盘点备注" prop="pandianbeizhu">
					<el-input v-model="ruleForm.pandianbeizhu" placeholder="盘点备注" clearable  :readonly="ro.pandianbeizhu"></el-input>
				</el-form-item>
				<el-form-item :style='{"padding":"2px 0","margin":"0 auto 10px","color":"inherit","borderRadius":"4px","background":"none","width":"100%","fontSize":"inherit"}' v-else class="input" label="盘点备注" prop="pandianbeizhu">
					<el-input v-model="ruleForm.pandianbeizhu" placeholder="盘点备注" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"padding":"2px 0","margin":"0 auto 10px","color":"inherit","borderRadius":"4px","background":"none","width":"100%","fontSize":"inherit"}' class="upload" v-if="type!='info' && !ro.huowutupian" label="货物图片" prop="huowutupian">
					<file-upload
						tip="点击上传货物图片"
						action="file/upload"
						:limit="3"
						:multiple="true"
						:fileUrls="ruleForm.huowutupian?ruleForm.huowutupian:''"
						@change="huowutupianUploadChange"
					></file-upload>
				</el-form-item>
				<el-form-item :style='{"padding":"2px 0","margin":"0 auto 10px","color":"inherit","borderRadius":"4px","background":"none","width":"100%","fontSize":"inherit"}' class="upload" v-else-if="ruleForm.huowutupian" label="货物图片" prop="huowutupian">
					<img v-if="ruleForm.huowutupian.substring(0,4)=='http'" class="upload-img" style="margin-right:20px;" v-bind:key="index" :src="ruleForm.huowutupian.split(',')[0]" width="100" height="100">
					<img v-else class="upload-img" style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in ruleForm.huowutupian.split(',')" :src="$base.url+item" width="100" height="100">
				</el-form-item>
				<el-form-item :style='{"padding":"2px 0","margin":"0 auto 10px","color":"inherit","borderRadius":"4px","background":"none","width":"100%","fontSize":"inherit"}' class="input" v-if="type!='info'"  label="员工工号" prop="yuangonggonghao">
					<el-input v-model="ruleForm.yuangonggonghao" placeholder="员工工号" clearable  :readonly="ro.yuangonggonghao"></el-input>
				</el-form-item>
				<el-form-item :style='{"padding":"2px 0","margin":"0 auto 10px","color":"inherit","borderRadius":"4px","background":"none","width":"100%","fontSize":"inherit"}' v-else class="input" label="员工工号" prop="yuangonggonghao">
					<el-input v-model="ruleForm.yuangonggonghao" placeholder="员工工号" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"padding":"2px 0","margin":"0 auto 10px","color":"inherit","borderRadius":"4px","background":"none","width":"100%","fontSize":"inherit"}' class="input" v-if="type!='info'"  label="员工姓名" prop="yuangongxingming">
					<el-input v-model="ruleForm.yuangongxingming" placeholder="员工姓名" clearable  :readonly="ro.yuangongxingming"></el-input>
				</el-form-item>
				<el-form-item :style='{"padding":"2px 0","margin":"0 auto 10px","color":"inherit","borderRadius":"4px","background":"none","width":"100%","fontSize":"inherit"}' v-else class="input" label="员工姓名" prop="yuangongxingming">
					<el-input v-model="ruleForm.yuangongxingming" placeholder="员工姓名" readonly></el-input>
				</el-form-item>
			</template>
			<el-form-item :style='{"padding":"0","margin":"30px auto","alignItems":"center","textAlign":"center","background":"none","display":"flex","width":"60%","fontSize":"18px"}' class="btn">
				<el-button class="btn3"  v-if="type!='info'" type="success" @click="onSubmit">
					<span class="icon iconfont icon-tijiao16" :style='{"color":"inherit","margin":"0 2px","fontSize":"inherit"}'></span>
					确定
				</el-button>
				<el-button class="btn4" v-if="type!='info'" type="success" @click="back()">
					<span class="icon iconfont icon-quxiao09" :style='{"color":"inherit","margin":"0 2px","fontSize":"inherit"}'></span>
					撤消
				</el-button>
				<el-button class="btn5" v-if="type=='info'" type="success" @click="back()">
					<span class="icon iconfont icon-fanhui01" :style='{"color":"inherit","margin":"0 2px","fontSize":"inherit"}'></span>
					返回
				</el-button>
			</el-form-item>
		</el-form>
    

  </div>
</template>
<script>
import { 
	isIntNumer,
} from "@/utils/validate";
export default {
	data() {
		var validateIntNumber = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isIntNumer(value)) {
				callback(new Error("请输入整数"));
			} else {
				callback();
			}
		};
		return {
			id: '',
			type: '',
			
			
			ro:{
				huowumingcheng : false,
				huowuleixing : false,
				guige : false,
				shuliang : false,
				pandianshuliang : false,
				pandianshijian : false,
				pandianbeizhu : false,
				huowutupian : false,
				yuangonggonghao : false,
				yuangongxingming : false,
			},
			
			
			ruleForm: {
				huowumingcheng: '',
				huowuleixing: '',
				guige: '',
				shuliang: '',
				pandianshuliang: '',
				pandianshijian: '',
				pandianbeizhu: '',
				huowutupian: '',
				yuangonggonghao: '',
				yuangongxingming: '',
			},
		

			
			rules: {
				huowumingcheng: [
				],
				huowuleixing: [
				],
				guige: [
				],
				shuliang: [
					{ validator: validateIntNumber, trigger: 'blur' },
				],
				pandianshuliang: [
					{ validator: validateIntNumber, trigger: 'blur' },
				],
				pandianshijian: [
				],
				pandianbeizhu: [
				],
				huowutupian: [
				],
				yuangonggonghao: [
				],
				yuangongxingming: [
				],
			},
		};
	},
	props: ["parent"],
	computed: {



	},
    components: {
    },
	created() {
		this.ruleForm.pandianshijian = this.getCurDate()
	},
	methods: {
		
		// 下载
		download(file){
			window.open(`${file}`)
		},
		// 初始化
		init(id,type) {
			if (id) {
				this.id = id;
				this.type = type;
			}
			if(this.type=='info'||this.type=='else'){
				this.info(id);
			}else if(this.type=='logistics'){
				this.logistics=false;
				this.info(id);
			}else if(this.type=='cross'){
				var obj = this.$storage.getObj('crossObj');
				for (var o in obj){
						if(o=='huowumingcheng'){
							this.ruleForm.huowumingcheng = obj[o];
							this.ro.huowumingcheng = true;
							continue;
						}
						if(o=='huowuleixing'){
							this.ruleForm.huowuleixing = obj[o];
							this.ro.huowuleixing = true;
							continue;
						}
						if(o=='guige'){
							this.ruleForm.guige = obj[o];
							this.ro.guige = true;
							continue;
						}
						if(o=='shuliang'){
							this.ruleForm.shuliang = obj[o];
							this.ro.shuliang = true;
							continue;
						}
						if(o=='pandianshuliang'){
							this.ruleForm.pandianshuliang = obj[o];
							this.ro.pandianshuliang = true;
							continue;
						}
						if(o=='pandianshijian'){
							this.ruleForm.pandianshijian = obj[o];
							this.ro.pandianshijian = true;
							continue;
						}
						if(o=='pandianbeizhu'){
							this.ruleForm.pandianbeizhu = obj[o];
							this.ro.pandianbeizhu = true;
							continue;
						}
						if(o=='huowutupian'){
							this.ruleForm.huowutupian = obj[o];
							this.ro.huowutupian = true;
							continue;
						}
						if(o=='yuangonggonghao'){
							this.ruleForm.yuangonggonghao = obj[o];
							this.ro.yuangonggonghao = true;
							continue;
						}
						if(o=='yuangongxingming'){
							this.ruleForm.yuangongxingming = obj[o];
							this.ro.yuangongxingming = true;
							continue;
						}
				}
			}
			// 获取用户信息
			this.$http({
				url: `${this.$storage.get('sessionTable')}/session`,
				method: "get"
			}).then(({ data }) => {
				if (data && data.code === 0) {
					var json = data.data;
					if(this.$storage.get("role")!="管理员") {
						this.ro.pandianshijian = true;
					}
					if(((json.yuangonggonghao!=''&&json.yuangonggonghao) || json.yuangonggonghao==0) && this.$storage.get("role")!="管理员"){
						this.ruleForm.yuangonggonghao = json.yuangonggonghao
						this.ro.yuangonggonghao = true;
					}
					if(((json.yuangongxingming!=''&&json.yuangongxingming) || json.yuangongxingming==0) && this.$storage.get("role")!="管理员"){
						this.ruleForm.yuangongxingming = json.yuangongxingming
						this.ro.yuangongxingming = true;
					}
				} else {
					this.$message.error(data.msg);
				}
			});
			
		},
    // 多级联动参数

		info(id) {
			this.$http({
				url: `kucunpandian/info/${id}`,
				method: "get"
			}).then(({ data }) => {
				if (data && data.code === 0) {
					this.ruleForm = data.data;
					//解决前台上传图片后台不显示的问题
					let reg=new RegExp('../../../upload','g')//g代表全部
				} else {
					this.$message.error(data.msg);
				}
			});
		},


    // 提交
    onSubmit() {
	if(this.ruleForm.huowutupian!=null) {
		this.ruleForm.huowutupian = this.ruleForm.huowutupian.replace(new RegExp(this.$base.url,"g"),"");
	}
var objcross = this.$storage.getObj('crossObj');
      //更新跨表属性
       var crossuserid;
       var crossrefid;
       var crossoptnum;
       if(this.type=='cross'){
                var statusColumnName = this.$storage.get('statusColumnName');
                var statusColumnValue = this.$storage.get('statusColumnValue');
                if(statusColumnName!='') {
                        var obj = this.$storage.getObj('crossObj');
                       if(statusColumnName && !statusColumnName.startsWith("[")) {
                               for (var o in obj){
                                 if(o==statusColumnName){
                                   obj[o] = statusColumnValue;
                                 }
                               }
                               var table = this.$storage.get('crossTable');
                             this.$http({
                                 url: `${table}/update`,
                                 method: "post",
                                 data: obj
                               }).then(({ data }) => {});
                       } else {
                               crossuserid=this.$storage.get('userid');
                               crossrefid=obj['id'];
                               crossoptnum=this.$storage.get('statusColumnName');
                               crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
                        }
                }
        }
		this.$refs["ruleForm"].validate(valid => {
			if (valid) {
				if(crossrefid && crossuserid) {
					this.ruleForm.crossuserid = crossuserid;
					this.ruleForm.crossrefid = crossrefid;
					let params = { 
						page: 1, 
						limit: 10, 
						crossuserid:this.ruleForm.crossuserid,
						crossrefid:this.ruleForm.crossrefid,
					} 
				this.$http({ 
					url: "kucunpandian/page", 
					method: "get", 
					params: params 
				}).then(({ 
					data 
				}) => { 
					if (data && data.code === 0) { 
						if(data.data.total>=crossoptnum) {
							this.$message.error(this.$storage.get('tips'));
							return false;
						} else {
							this.$http({
								url: `kucunpandian/${!this.ruleForm.id ? "save" : "update"}`,
								method: "post",
								data: this.ruleForm
							}).then(({ data }) => {
								if (data && data.code === 0) {
									this.$message({
										message: "操作成功",
										type: "success",
										duration: 1500,
										onClose: () => {
											this.parent.showFlag = true;
											this.parent.addOrUpdateFlag = false;
											this.parent.kucunpandianCrossAddOrUpdateFlag = false;
											this.parent.search();
											this.parent.contentStyleChange();
										}
									});
								} else {
									this.$message.error(data.msg);
								}
							});

						}
					} else { 
				} 
			});
		} else {
			this.$http({
				url: `kucunpandian/${!this.ruleForm.id ? "save" : "update"}`,
				method: "post",
			   data: this.ruleForm
			}).then(({ data }) => {
				if (data && data.code === 0) {
					this.$message({
						message: "操作成功",
						type: "success",
						duration: 1500,
						onClose: () => {
							this.parent.showFlag = true;
							this.parent.addOrUpdateFlag = false;
							this.parent.kucunpandianCrossAddOrUpdateFlag = false;
							this.parent.search();
							this.parent.contentStyleChange();
						}
					});
				} else {
					this.$message.error(data.msg);
			   }
			});
		 }
         }
		});
    },
    // 获取uuid
    getUUID () {
      return new Date().getTime();
    },
    // 返回
    back() {
      this.parent.showFlag = true;
      this.parent.addOrUpdateFlag = false;
      this.parent.kucunpandianCrossAddOrUpdateFlag = false;
      this.parent.contentStyleChange();
    },
    huowutupianUploadChange(fileUrls) {
	    this.ruleForm.huowutupian = fileUrls;
    },
  }
};
</script>
<style lang="scss" scoped>
	.amap-wrapper {
		width: 100%;
		height: 500px;
	}
	
	.search-box {
		position: absolute;
	}
	
	.el-date-editor.el-input {
		width: auto;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__label {
	  	  padding: 0 10px 0 0;
	  	  color: inherit;
	  	  background: none;
	  	  font-weight: 600;
	  	  display: inline-block;
	  	  width: 200px;
	  	  font-size: inherit;
	  	  line-height: 40px;
	  	  text-align: right;
	  	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__content {
	  margin-left: 200px;
	}
	
	.add-update-preview .el-input /deep/ .el-input__inner {
	  	  border-radius: 0px;
	  	  padding: 0 12px;
	  	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  	  outline: none;
	  	  color: inherit;
	  	  background: #fff;
	  	  width: 400px;
	  	  font-size: 16px;
	  	  border-color: #C7D5E0;
	  	  border-width: 0 0 1px;
	  	  border-style: solid;
	  	  height: 36px;
	  	}
	.add-update-preview .el-input-number /deep/ .el-input__inner {
		text-align: left;
	  	  border-radius: 0px;
	  	  padding: 0 12px;
	  	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  	  outline: none;
	  	  color: inherit;
	  	  background: #fff;
	  	  width: 400px;
	  	  font-size: 16px;
	  	  border-color: #C7D5E0;
	  	  border-width: 0 0 1px;
	  	  border-style: solid;
	  	  height: 36px;
	  	}
	.add-update-preview .el-input-number /deep/ .el-input-number__decrease {
		display: none;
	}
	.add-update-preview .el-input-number /deep/ .el-input-number__increase {
		display: none;
	}
	
	.add-update-preview .el-select /deep/ .el-input__inner {
	  	  padding: 0 10px;
	  	  color: inherit;
	  	  font-size: 16px;
	  	  border-color: #C7D5E0;
	  	  border-radius: 0px;
	  	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  	  outline: none;
	  	  background: #fff;
	  	  width: auto;
	  	  border-width: 0 0 1px;
	  	  border-style: solid;
	  	  min-width: 350px;
	  	  height: 36px;
	  	}
	
	.add-update-preview .el-date-editor /deep/ .el-input__inner {
	  	  padding: 0 10px 0 30px;
	  	  color: inherit;
	  	  font-size: 16px;
	  	  border-color: #C7D5E0;
	  	  border-radius: 0px;
	  	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  	  outline: none;
	  	  background: none;
	  	  width: auto;
	  	  border-width: 0 0 1px;
	  	  border-style: solid;
	  	  min-width: 250px;
	  	  height: 36px;
	  	}
	
	.add-update-preview /deep/ .el-upload--picture-card {
		background: transparent;
		border: 0;
		border-radius: 0;
		width: auto;
		height: auto;
		line-height: initial;
		vertical-align: middle;
	}
	
	.add-update-preview /deep/ .upload .upload-img {
	  	  border: 1px solid #C7D5E0;
	  	  cursor: pointer;
	  	  border-radius: 20px;
	  	  color: #aaa;
	  	  background: #fff;
	  	  object-fit: cover;
	  	  width: 180px;
	  	  font-size: 32px;
	  	  line-height: 100px;
	  	  text-align: center;
	  	  height: 100px;
	  	}
	
	.add-update-preview /deep/ .el-upload-list .el-upload-list__item {
	  	  border: 1px solid #C7D5E0;
	  	  cursor: pointer;
	  	  border-radius: 20px;
	  	  color: #aaa;
	  	  background: #fff;
	  	  object-fit: cover;
	  	  width: 180px;
	  	  font-size: 32px;
	  	  line-height: 100px;
	  	  text-align: center;
	  	  height: 100px;
	  	}
	
	.add-update-preview /deep/ .el-upload .el-icon-plus {
	  	  border: 1px solid #C7D5E0;
	  	  cursor: pointer;
	  	  border-radius: 20px;
	  	  color: #aaa;
	  	  background: #fff;
	  	  object-fit: cover;
	  	  width: 180px;
	  	  font-size: 32px;
	  	  line-height: 100px;
	  	  text-align: center;
	  	  height: 100px;
	  	}
	
	.add-update-preview .el-textarea /deep/ .el-textarea__inner {
	  	  border: 1px solid #C7D5E0;
	  	  border-radius: 20px;
	  	  padding: 12px;
	  	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  	  outline: none;
	  	  color: inherit;
	  	  background: #fff;
	  	  width: 500px;
	  	  font-size: 16px;
	  	  height: 140px;
	  	}
	
	.add-update-preview .btn .btn1 {
				border: 1px solid #3fcbca;
				cursor: pointer;
				padding: 0 10px;
				margin: 0px 4px;
				color: #3fcbca;
				display: inline-block;
				font-size: 18px;
				line-height: 24px;
				border-radius: 20px;
				outline: none;
				background: none;
				width: auto;
				height: 40px;
			}
	
	.add-update-preview .btn .btn1:hover {
				opacity: 0.8;
			}
	
	.add-update-preview .btn .btn2 {
				border: 1px solid #23b7e5;
				cursor: pointer;
				border-radius: 20px;
				padding: 0 10px;
				margin: 0px 4px;
				outline: none;
				color: #23b7e5;
				background: none;
				width: auto;
				font-size: 18px;
				line-height: 24px;
				height: 40px;
			}
	
	.add-update-preview .btn .btn2:hover {
				opacity: 0.8;
			}
	
	.add-update-preview .btn .btn3 {
				border: 1px solid #3fcbca;
				cursor: pointer;
				border-radius: 20px;
				padding: 0 20px;
				margin: 0px 4px;
				outline: none;
				color: #3fcbca;
				background: none;
				width: auto;
				font-size: 18px;
				line-height: 24px;
				height: 40px;
			}
	
	.add-update-preview .btn .btn3:hover {
				opacity: 0.8;
			}
	
	.add-update-preview .btn .btn4 {
				border: 1px solid #FF6B6B;
				cursor: pointer;
				border-radius: 20px;
				padding: 0 20px;
				margin: 0px 4px;
				outline: none;
				color: #FF6B6B;
				background: none;
				width: auto;
				font-size: 18px;
				line-height: 24px;
				height: 40px;
			}
	
	.add-update-preview .btn .btn4:hover {
				opacity: 0.8;
			}
	
	.add-update-preview .btn .btn5 {
				border: 1px solid #65C3DF;
				cursor: pointer;
				border-radius: 20px;
				padding: 0 20px;
				margin: 4px;
				outline: none;
				color: #65C3DF;
				background: none;
				width: auto;
				font-size: 18px;
				line-height: 24px;
				height: 40px;
			}
	
	.add-update-preview .btn .btn5:hover {
				opacity: 0.8;
			}
</style>
