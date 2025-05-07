<template>
<div class="content" :style='{"minHeight":"calc(100vh - 200px)","padding":"30px","margin":"0 auto","alignItems":"flex-start","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230831/511269159d614e62a63378dfef0a7567.png) no-repeat center top / cover","display":"flex","width":"calc(100% - 60px)","fontSize":"16px","height":"100%"}'>
	<!-- notice -->
	<!-- title -->
	<div class="text" :style='{"padding":"10px 20px","boxShadow":"inset 0px 0px 12px 0px #E8EFF7,0 3px 6px 0px rgba(100,100,100,.1)","margin":"0px auto 40px","borderColor":"#ceddee","color":"rgb(51, 51, 51)","textAlign":"center","borderRadius":"20px 20px 8px 8px","background":"#fff","borderWidth":"6px 1px 1px","width":"auto","fontSize":"28px","borderStyle":"solid","fontWeight":"500"}'>欢迎使用 {{this.$project.projectName}}</div>
	<!-- statis -->
	<div :style='{"padding":"0","boxShadow":"0 0px 0px 0px rgba(100,100,100,.05)","margin":"0 0px 30px 0px","borderColor":"#fceaee","alignItems":"center","color":"#666","display":"flex","justifyContent":"center","borderRadius":"3px","flexWrap":"wrap","background":"none","borderWidth":"0px","width":"100%","fontSize":"18px","borderStyle":"double","order":"1"}'>
		<div :style='{"boxShadow":"0 0px 0px rgba(0,0,0,.3)","padding":"0 10px 0 0","margin":"0 2% 10px 0","borderColor":"#ceddee","borderRadius":"3px","textAlign":"center","background":"#2aca76","borderWidth":"0px","display":"flex","width":"18%","borderStyle":"solid","justifyContent":"center"}' v-if="isAuth('huowuxinxi','首页总数')">
			<div :style='{"width":"80px","alignItems":"center","background":"none","justifyContent":"center","display":"flex","height":"100px"}'>
				<span class="icon iconfont icon-tongji7" :style='{"color":"#fff","fontSize":"32px"}'></span>
			</div>
			<div :style='{"width":"auto","flexDirection":"column-reverse","justifyContent":"center","display":"flex"}'>
				<div :style='{"margin":"5px 0","lineHeight":"24px","fontSize":"32px","color":"#fff","fontWeight":"bold","height":"24px"}'>{{huowuxinxiCount}}</div>
				<div :style='{"margin":"5px 0","lineHeight":"24px","fontSize":"inherit","color":"#fff","height":"24px"}'>货物信息总数</div>
			</div>
		</div>
		<div :style='{"boxShadow":"0 0px 0px rgba(0,0,0,.3)","padding":"0 10px 0 0","margin":"0 2% 10px 0","borderColor":"#ceddee","borderRadius":"3px","textAlign":"center","background":"#ea8556","borderWidth":"0px","display":"flex","width":"18%","borderStyle":"solid","justifyContent":"center"}' v-if="isAuth('rukuguanli','首页总数')">
			<div :style='{"width":"80px","alignItems":"center","background":"none","justifyContent":"center","display":"flex","height":"100px"}'>
				<span class="icon iconfont icon-tongji5" :style='{"color":"#fff","fontSize":"32px"}'></span>
			</div>
			<div :style='{"width":"auto","flexDirection":"column-reverse","justifyContent":"center","display":"flex"}'>
				<div :style='{"margin":"5px 0","lineHeight":"24px","fontSize":"32px","color":"#fff","fontWeight":"bold","height":"24px"}'>{{rukuguanliCount}}</div>
				<div :style='{"margin":"5px 0","lineHeight":"24px","fontSize":"inherit","color":"#fff","height":"24px"}'>入库管理总数</div>
			</div>
		</div>
		<div :style='{"boxShadow":"0 0px 0px rgba(0,0,0,.3)","padding":"0 10px 0 0","margin":"0 2% 10px 0","borderColor":"#ceddee","borderRadius":"3px","textAlign":"center","background":"#53b5e6","borderWidth":"0px","display":"flex","width":"18%","borderStyle":"solid","justifyContent":"center"}' v-if="isAuth('chukuguanli','首页总数')">
			<div :style='{"width":"80px","alignItems":"center","background":"none","justifyContent":"center","display":"flex","height":"100px"}'>
				<span class="icon iconfont icon-tongji7" :style='{"color":"#fff","fontSize":"32px"}'></span>
			</div>
			<div :style='{"width":"auto","flexDirection":"column-reverse","justifyContent":"center","display":"flex"}'>
				<div :style='{"margin":"5px 0","lineHeight":"24px","fontSize":"32px","color":"#fff","fontWeight":"bold","height":"24px"}'>{{chukuguanliCount}}</div>
				<div :style='{"margin":"5px 0","lineHeight":"24px","fontSize":"inherit","color":"#fff","height":"24px"}'>出库管理总数</div>
			</div>
		</div>
	</div>
	<!-- statis -->
	

	
	<!-- echarts -->
	<!-- 3 -->
	<div class="type3" :style='{"alignContent":"flex-start","padding":"0","borderRadius":"8px","flexWrap":"wrap","background":"none","flex":"1","display":"flex","width":"100%","position":"relative","justifyContent":"space-between","height":"auto","order":"1"}'>
		<div id="huowuxinxiChart1" class="echarts1" v-if="isAuth('huowuxinxi','首页统计')"></div>
		<div id="rukuguanliChart1" class="echarts2" v-if="isAuth('rukuguanli','首页统计')"></div>
		<div id="chukuguanliChart1" class="echarts3" v-if="isAuth('chukuguanli','首页统计')"></div>
	</div>
</div>
</template>
<script>
//3
import router from '@/router/router-static'
import * as echarts from 'echarts'
export default {
	data() {
		return {
            huowuxinxiCount: 0,
            rukuguanliCount: 0,
            chukuguanliCount: 0,
			line: {"backgroundColor":"transparent","yAxis":{"axisLabel":{"borderType":"solid","rotate":0,"padding":0,"shadowOffsetX":0,"margin":15,"backgroundColor":"transparent","borderColor":"#000","shadowOffsetY":0,"color":"#333","shadowBlur":0,"show":true,"inside":false,"ellipsis":"...","overflow":"none","borderRadius":0,"borderWidth":0,"width":"","fontSize":12,"lineHeight":24,"shadowColor":"transparent","fontWeight":"normal","height":""},"axisTick":{"show":true,"length":5,"lineStyle":{"shadowOffsetX":0,"shadowOffsetY":0,"cap":"butt","color":"#333","shadowBlur":0,"width":1,"type":"solid","opacity":1,"shadowColor":"rgba(0,0,0,.5)"},"inside":false},"splitLine":{"lineStyle":{"shadowOffsetX":0,"shadowOffsetY":0,"cap":"butt","color":"#666","shadowBlur":0,"width":1,"type":"solid","opacity":1,"shadowColor":"rgba(0,0,0,.5)"},"show":true},"axisLine":{"lineStyle":{"shadowOffsetX":0,"shadowOffsetY":0,"cap":"butt","color":"#333","shadowBlur":0,"width":1,"type":"solid","opacity":1,"shadowColor":"rgba(0,0,0,.5)"},"show":true},"splitArea":{"show":false,"areaStyle":{"shadowOffsetX":0,"shadowOffsetY":0,"color":"rgba(25,25,25,0.3)","opacity":1,"shadowBlur":10,"shadowColor":"rgba(0,0,0,.5)"}}},"xAxis":{"axisLabel":{"borderType":"solid","rotate":0,"padding":0,"shadowOffsetX":0,"margin":4,"backgroundColor":"transparent","borderColor":"#000","shadowOffsetY":0,"color":"#333","shadowBlur":0,"show":true,"inside":false,"ellipsis":"...","overflow":"none","borderRadius":0,"borderWidth":0,"width":"","fontSize":12,"lineHeight":24,"shadowColor":"transparent","fontWeight":"normal","height":""},"axisTick":{"show":true,"length":5,"lineStyle":{"shadowOffsetX":0,"shadowOffsetY":0,"cap":"butt","color":"#333","shadowBlur":0,"width":1,"type":"solid","opacity":1,"shadowColor":"rgba(0,0,0,.5)"},"inside":false},"splitLine":{"lineStyle":{"shadowOffsetX":0,"shadowOffsetY":0,"cap":"butt","color":"#333","shadowBlur":0,"width":1,"type":"solid","opacity":1,"shadowColor":"rgba(0,0,0,.5)"},"show":false},"axisLine":{"lineStyle":{"shadowOffsetX":0,"shadowOffsetY":0,"cap":"butt","color":"#333","shadowBlur":0,"width":1,"type":"solid","opacity":1,"shadowColor":"rgba(0,0,0,.5)"},"show":true},"splitArea":{"show":false,"areaStyle":{"shadowOffsetX":0,"shadowOffsetY":0,"color":"rgba(25,25,25,.3)","opacity":1,"shadowBlur":10,"shadowColor":"rgba(0,0,0,.5)"}}},"color":["#5470c6","#91cc75","#fac858","#ee6666","#73c0de","#3ba272","#fc8452","#9a60b4","#ea7ccc"],"legend":{"padding":0,"itemGap":10,"shadowOffsetX":0,"backgroundColor":"transparent","borderColor":"#666","shadowOffsetY":0,"orient":"horizontal","shadowBlur":0,"bottom":"auto","itemHeight":14,"show":true,"icon":"roundRect","itemStyle":{"borderType":"solid","shadowOffsetX":0,"borderColor":"inherit","shadowOffsetY":0,"color":"#333","shadowBlur":0,"borderWidth":0,"opacity":1,"shadowColor":"transparent"},"right":"auto","top":"auto","borderRadius":0,"lineStyle":{"shadowOffsetX":0,"shadowOffsetY":0,"color":"inherit","shadowBlur":0,"width":"auto","type":"inherit","opacity":1,"shadowColor":"transparent"},"left":"right","borderWidth":0,"width":"80%","itemWidth":20,"textStyle":{"textBorderWidth":0,"color":"#333","textShadowColor":"transparent","ellipsis":"...","overflow":"none","fontSize":12,"lineHeight":24,"textShadowOffsetX":0,"textShadowOffsetY":0,"textBorderType":"solid","fontWeight":500,"textBorderColor":"transparent","textShadowBlur":0},"shadowColor":"rgba(0,0,0,.3)","height":"auto"},"series":{"showSymbol":true,"symbol":"emptyCircle","symbolSize":4},"tooltip":{"backgroundColor":"#fff","textStyle":{"color":"#333"}},"title":{"borderType":"solid","padding":0,"shadowOffsetX":0,"backgroundColor":"transparent","borderColor":"#666","shadowOffsetY":0,"shadowBlur":0,"bottom":"auto","show":true,"right":"auto","top":"auto","borderRadius":0,"left":"left","borderWidth":0,"textStyle":{"textBorderWidth":0,"color":"#666","textShadowColor":"transparent","fontSize":14,"lineHeight":24,"textShadowOffsetX":0,"textShadowOffsetY":0,"textBorderType":"solid","fontWeight":600,"textBorderColor":"#666","textShadowBlur":0},"shadowColor":"transparent"}},
			bar: {"backgroundColor":"transparent","yAxis":{"axisLabel":{"borderType":"solid","rotate":0,"padding":0,"shadowOffsetX":0,"margin":12,"backgroundColor":"transparent","borderColor":"#666","shadowOffsetY":0,"color":"#333","shadowBlur":0,"show":true,"inside":false,"ellipsis":"...","overflow":"none","borderRadius":0,"borderWidth":0,"width":"","fontSize":12,"lineHeight":24,"shadowColor":"transparent","fontWeight":"normal","height":""},"axisTick":{"show":true,"length":5,"lineStyle":{"shadowOffsetX":0,"shadowOffsetY":0,"cap":"butt","color":"#333","shadowBlur":0,"width":1,"type":"solid","opacity":1,"shadowColor":"rgba(0,0,0,.5)"},"inside":false},"splitLine":{"lineStyle":{"shadowOffsetX":0,"shadowOffsetY":0,"cap":"butt","color":"#666","shadowBlur":0,"width":1,"type":"solid","opacity":1,"shadowColor":"rgba(0,0,0,.5)"},"show":true},"axisLine":{"lineStyle":{"shadowOffsetX":0,"shadowOffsetY":0,"cap":"butt","color":"#333","shadowBlur":0,"width":1,"type":"solid","opacity":1,"shadowColor":"rgba(0,0,0,.5)"},"show":true},"splitArea":{"show":false,"areaStyle":{"shadowOffsetX":0,"shadowOffsetY":0,"color":"rgba(25,25,25,0.3)","opacity":1,"shadowBlur":10,"shadowColor":"rgba(0,0,0,.5)"}}},"xAxis":{"axisLabel":{"borderType":"solid","rotate":0,"padding":0,"shadowOffsetX":0,"margin":4,"backgroundColor":"transparent","borderColor":"#000","shadowOffsetY":0,"color":"#333","shadowBlur":0,"show":true,"inside":false,"ellipsis":"...","overflow":"none","borderRadius":0,"borderWidth":0,"width":"","fontSize":12,"lineHeight":24,"shadowColor":"transparent","fontWeight":"normal","height":""},"axisTick":{"show":true,"length":5,"lineStyle":{"shadowOffsetX":0,"shadowOffsetY":0,"cap":"butt","color":"#333","shadowBlur":0,"width":1,"type":"solid","opacity":1,"shadowColor":"rgba(0,0,0,.5)"},"inside":false},"splitLine":{"lineStyle":{"shadowOffsetX":0,"shadowOffsetY":0,"cap":"butt","color":"#333","shadowBlur":0,"width":1,"type":"solid","opacity":1,"shadowColor":"rgba(0,0,0,.5)"},"show":false},"axisLine":{"lineStyle":{"shadowOffsetX":0,"shadowOffsetY":0,"cap":"butt","color":"#333","shadowBlur":0,"width":1,"type":"solid","opacity":1,"shadowColor":"rgba(0,0,0,.5)"},"show":true},"splitArea":{"show":false,"areaStyle":{"shadowOffsetX":0,"shadowOffsetY":0,"color":"rgba(25,25,25,.3)","opacity":1,"shadowBlur":10,"shadowColor":"rgba(0,0,0,.5)"}}},"color":["#00ff00","#91cc75","#fac858","#ee6666","#73c0de","#3ba272","#fc8452","#9a60b4","#ea7ccc"],"legend":{"padding":0,"itemGap":10,"shadowOffsetX":0,"backgroundColor":"transparent","borderColor":"#666","shadowOffsetY":0,"orient":"horizontal","shadowBlur":0,"bottom":"auto","itemHeight":14,"show":true,"icon":"roundRect","itemStyle":{"borderType":"solid","shadowOffsetX":0,"borderColor":"inherit","shadowOffsetY":0,"color":"#333","shadowBlur":0,"borderWidth":0,"opacity":1,"shadowColor":"transparent"},"right":"auto","top":"auto","borderRadius":0,"lineStyle":{"shadowOffsetX":0,"shadowOffsetY":0,"color":"inherit","shadowBlur":0,"width":"auto","type":"inherit","opacity":1,"shadowColor":"transparent"},"left":"right","borderWidth":0,"width":"80%","itemWidth":20,"textStyle":{"textBorderWidth":0,"color":"#333","textShadowColor":"transparent","ellipsis":"...","overflow":"none","fontSize":12,"lineHeight":24,"textShadowOffsetX":0,"textShadowOffsetY":0,"textBorderType":"solid","fontWeight":500,"textBorderColor":"transparent","textShadowBlur":0},"shadowColor":"rgba(0,0,0,.3)","height":"auto"},"series":{"barWidth":"auto","itemStyle":{"borderType":"solid","shadowOffsetX":0,"borderColor":"#666","shadowOffsetY":0,"color":"","shadowBlur":0,"borderWidth":0,"opacity":1,"shadowColor":"#000"},"colorBy":"data","barCategoryGap":"20%"},"tooltip":{"backgroundColor":"#fff","textStyle":{"color":"#333"}},"title":{"borderType":"solid","padding":0,"shadowOffsetX":0,"backgroundColor":"transparent","borderColor":"#666","shadowOffsetY":0,"shadowBlur":0,"bottom":"auto","show":true,"right":"auto","top":"auto","borderRadius":0,"left":"left","borderWidth":0,"textStyle":{"textBorderWidth":0,"color":"#666","textShadowColor":"transparent","fontSize":14,"lineHeight":24,"textShadowOffsetX":0,"textShadowOffsetY":0,"textBorderType":"solid","fontWeight":600,"textBorderColor":"#666","textShadowBlur":0},"shadowColor":"transparent"},"base":{"animate":false,"interval":2000}},
			pie: {"tooltip":{"backgroundColor":"#fff","textStyle":{"color":"#333"}},"backgroundColor":"transparent","color":["#5470c6","#91cc75","#fac858","#ee6666","#73c0de","#3ba272","#fc8452","#9a60b4","#ea7ccc"],"title":{"borderType":"solid","padding":0,"shadowOffsetX":0,"backgroundColor":"transparent","borderColor":"#666","shadowOffsetY":0,"shadowBlur":0,"bottom":"auto","show":true,"right":"auto","top":"auto","borderRadius":0,"left":"left","borderWidth":0,"textStyle":{"textBorderWidth":0,"color":"#666","textShadowColor":"transparent","fontSize":14,"lineHeight":24,"textShadowOffsetX":0,"textShadowOffsetY":0,"textBorderType":"solid","fontWeight":600,"textBorderColor":"#666","textShadowBlur":0},"shadowColor":"transparent"},"legend":{"padding":0,"itemGap":10,"shadowOffsetX":0,"backgroundColor":"transparent","borderColor":"#666","shadowOffsetY":0,"orient":"horizontal","shadowBlur":0,"bottom":"auto","itemHeight":14,"show":true,"icon":"roundRect","itemStyle":{"borderType":"solid","shadowOffsetX":0,"borderColor":"inherit","shadowOffsetY":0,"color":"inherit","shadowBlur":0,"borderWidth":0,"opacity":1,"shadowColor":"transparent"},"right":0,"top":"auto","borderRadius":0,"lineStyle":{"shadowOffsetX":0,"shadowOffsetY":0,"color":"inherit","shadowBlur":0,"width":"auto","type":"inherit","opacity":1,"shadowColor":"transparent"},"left":"right","borderWidth":0,"width":"80%","itemWidth":20,"textStyle":{"textBorderWidth":0,"color":"#333","textShadowColor":"transparent","ellipsis":"...","overflow":"none","fontSize":12,"lineHeight":24,"textShadowOffsetX":0,"textShadowOffsetY":0,"textBorderType":"solid","fontWeight":500,"textBorderColor":"transparent","textShadowBlur":0},"shadowColor":"rgba(0,0,0,.3)","height":"auto"},"series":{"itemStyle":{"borderType":"solid","shadowOffsetX":0,"borderColor":"#666","shadowOffsetY":0,"color":"","shadowBlur":0,"borderWidth":0,"opacity":1,"shadowColor":"#000"},"label":{"borderType":"solid","rotate":0,"padding":0,"textBorderWidth":0,"backgroundColor":"transparent","borderColor":"#666","color":"#333","show":true,"textShadowColor":"transparent","distanceToLabelLine":5,"ellipsis":"...","overflow":"none","borderRadius":0,"borderWidth":0,"fontSize":12,"lineHeight":18,"textShadowOffsetX":0,"position":"outside","textShadowOffsetY":0,"textBorderType":"solid","textBorderColor":"#666","textShadowBlur":0},"labelLine":{"show":true,"length":10,"lineStyle":{"shadowOffsetX":0,"shadowOffsetY":0,"color":"#333","shadowBlur":0,"width":1,"type":"solid","opacity":1,"shadowColor":"#000"},"length2":14,"smooth":false}}},
			funnel: {"tooltip":{"backgroundColor":"#fff","textStyle":{"color":"#333"}},"backgroundColor":"transparent","color":["#5470c6","#91cc75","#fac858","#ee6666","#73c0de","#3ba272","#fc8452","#9a60b4","#ea7ccc"],"title":{"borderType":"solid","padding":2,"shadowOffsetX":0,"backgroundColor":"transparent","borderColor":"#ccc","shadowOffsetY":0,"shadowBlur":0,"bottom":"auto","show":true,"right":"auto","top":"auto","borderRadius":0,"left":"center","borderWidth":0,"textStyle":{"textBorderWidth":0,"color":"#666","textShadowColor":"transparent","fontSize":14,"lineHeight":24,"textShadowOffsetX":0,"textShadowOffsetY":0,"textBorderType":"solid","fontWeight":500,"textBorderColor":"#ccc","textShadowBlur":0},"shadowColor":"transparent"},"legend":{"padding":5,"itemGap":10,"shadowOffsetX":0,"backgroundColor":"transparent","borderColor":"#ccc","shadowOffsetY":0,"orient":"vertical","shadowBlur":0,"bottom":"auto","itemHeight":14,"show":true,"icon":"roundRect","itemStyle":{"borderType":"solid","shadowOffsetX":0,"borderColor":"inherit","shadowOffsetY":0,"color":"inherit","shadowBlur":0,"borderWidth":0,"opacity":1,"shadowColor":"transparent"},"top":"auto","borderRadius":0,"lineStyle":{"shadowOffsetX":0,"shadowOffsetY":0,"color":"inherit","shadowBlur":0,"width":"auto","type":"inherit","opacity":1,"shadowColor":"transparent"},"left":"left","borderWidth":0,"width":"auto","itemWidth":25,"textStyle":{"textBorderWidth":0,"color":"#666","textShadowColor":"transparent","ellipsis":"...","overflow":"none","fontSize":12,"lineHeight":24,"textShadowOffsetX":0,"textShadowOffsetY":0,"textBorderType":"solid","fontWeight":500,"textBorderColor":"transparent","textShadowBlur":0},"shadowColor":"rgba(0,0,0,.3)","height":"auto"},"series":{"itemStyle":{"borderType":"solid","shadowOffsetX":0,"borderColor":"#000","shadowOffsetY":0,"color":"","shadowBlur":0,"borderWidth":0,"opacity":1,"shadowColor":"#000"},"label":{"borderType":"solid","rotate":0,"padding":0,"textBorderWidth":0,"backgroundColor":"transparent","borderColor":"#fff","color":"","show":true,"textShadowColor":"transparent","distanceToLabelLine":5,"ellipsis":"...","overflow":"none","borderRadius":0,"borderWidth":0,"fontSize":12,"lineHeight":18,"textShadowOffsetX":0,"position":"outside","textShadowOffsetY":0,"textBorderType":"solid","textBorderColor":"#fff","textShadowBlur":0},"labelLine":{"show":true,"length":10,"lineStyle":{"shadowOffsetX":0,"shadowOffsetY":0,"shadowBlur":0,"width":1,"type":"solid","opacity":1,"shadowColor":"#000"},"length2":14,"smooth":false}}},
			boardBase: {"funnelNum":8,"lineNum":8,"gaugeNum":8,"barNum":8,"pieNum":8},
			gauge: {"tooltip":{"formatter":"{b} : {c}","trigger":"item"},"backgroundColor":"transparent","color":["#5470c6","#91cc75","#fac858","#ee6666","#73c0de","#3ba272","#fc8452","#9a60b4","#ea7ccc"],"title":{"top":"top","left":"left","textStyle":{"textBorderWidth":0,"color":"#666","textShadowColor":"transparent","fontSize":14,"lineHeight":24,"textShadowOffsetX":0,"textShadowOffsetY":0,"textBorderType":"solid","fontWeight":600,"textBorderColor":"#666","textShadowBlur":0}},"series":{"pointer":{"offsetCenter":[0,"10%"],"icon":"path://M2.9,0.7L2.9,0.7c1.4,0,2.6,1.2,2.6,2.6v115c0,1.4-1.2,2.6-2.6,2.6l0,0c-1.4,0-2.6-1.2-2.6-2.6V3.3C0.3,1.9,1.4,0.7,2.9,0.7z","width":8,"length":"80%"},"axisLine":{"lineStyle":{"shadowOffsetX":0,"shadowOffsetY":0,"opacity":0.5,"shadowBlur":1,"shadowColor":"#000"},"roundCap":true},"anchor":{"show":true,"itemStyle":{"color":"inherit"},"size":18,"showAbove":true},"emphasis":{"disabled":false},"progress":{"show":true,"roundCap":true,"overlap":true},"splitNumber":25,"detail":{"formatter":"{value}","backgroundColor":"inherit","color":"#fff","borderRadius":3,"width":20,"fontSize":14,"height":16},"title":{"fontSize":14},"animation":true}},
		};
	},
	mounted(){
		this.init();
		this.gethuowuxinxiCount();
		this.huowuxinxiChat1();
		this.getrukuguanliCount();
		this.rukuguanliChat1();
		this.getchukuguanliCount();
		this.chukuguanliChat1();
	},
	methods:{
		// 统计图动画
		myChartInterval(type, xAxisData, seriesData, myChart) {
			this.$nextTick(() => {
				setInterval(() => {
					let xAxis = xAxisData.shift()
					xAxisData.push(xAxis)
					let series = seriesData.shift()
					seriesData.push(series)
				
					if (type == 1) {
						myChart.setOption({
							xAxis: [{
								data: xAxisData
							}],
							series: [{
								data: seriesData
							}]
						});
					}
					if (type == 2) {
						myChart.setOption({
							yAxis: [{
								data: xAxisData
							}],
							series: [{
								data: seriesData
							}]
						});
					}
				}, 2000);
			})
		},
		init(){
			if(this.$storage.get('Token')){
			this.$http({
				url: `${this.$storage.get('sessionTable')}/session`,
				method: "get"
			}).then(({ data }) => {
				if (data && data.code != 0) {
				router.push({ name: 'login' })
				}
			});
			}else{
				router.push({ name: 'login' })
			}
		},
		gethuowuxinxiCount() {
			this.$http({
				url: `huowuxinxi/count`,
				method: "get"
			}).then(({
				data
			}) => {
				if (data && data.code == 0) {
					this.huowuxinxiCount = data.data
				}
			})
		},
// 1234 饼2
		huowuxinxiChat1() {
			this.$nextTick(()=>{

        var huowuxinxiChart1 = echarts.init(document.getElementById("huowuxinxiChart1"),'macarons');
        this.$http({
            url: `huowuxinxi/value/huowumingcheng/shuliang`,
            method: "get",
        }).then(({ data }) => {
            if (data && data.code === 0) {
                let res = data.data;
                let xAxis = [];
                let yAxis = [];
                let pArray = []
                for(let i=0;i<res.length;i++){
					if(this.boardBase&&i==this.boardBase.pieNum){
						break;
					}
                    xAxis.push(res[i].huowumingcheng);
                    yAxis.push(parseFloat((res[i].total)));
                    pArray.push({
                        value: parseFloat((res[i].total)),
                        name: res[i].huowumingcheng
                    })
                }
                var option = {};
				let titleObj = this.pie.title
				titleObj.text = '库存统计'
				
				const legendObj = this.pie.legend
				let tooltipObj = {trigger: 'item',formatter: '{b} : {c} ({d}%)'}
				tooltipObj = Object.assign(tooltipObj , this.pie.tooltip?this.pie.tooltip:{})
				
				let seriesObj = {
					type: 'pie',
					radius: ['25%', '55%'],
					center: ['50%', '60%'],
					data: pArray,
					emphasis: {
						itemStyle: {
							shadowBlur: 10,
							shadowOffsetX: 0,
							shadowColor: 'rgba(0, 0, 0, 0.5)'
						}
					}
				}
				seriesObj = Object.assign(seriesObj , this.pie.series)
				const gridObj = this.pie.grid
                option = {
                	backgroundColor: this.pie.backgroundColor,
                	color: this.pie.color,
                	title: titleObj,
                	legend: legendObj,
					grid: gridObj,
                	tooltip: tooltipObj,
                	series: [seriesObj]
                };
                // 使用刚指定的配置项和数据显示图表。
                huowuxinxiChart1.setOption(option);
				
                  //根据窗口的大小变动图表
                window.onresize = function() {
                    huowuxinxiChart1.resize();
                };
            }
        });
      })
    },


		getrukuguanliCount() {
			this.$http({
				url: `rukuguanli/count`,
				method: "get"
			}).then(({
				data
			}) => {
				if (data && data.code == 0) {
					this.rukuguanliCount = data.data
				}
			})
		},
// 1234 折
		rukuguanliChat1() {
			this.$nextTick(()=>{

        var rukuguanliChart1 = echarts.init(document.getElementById("rukuguanliChart1"),'macarons');
        this.$http({
            url: `rukuguanli/value/huowumingcheng/shuliang`,
            method: "get",
        }).then(({ data }) => {
            if (data && data.code === 0) {
                let res = data.data;
                let xAxis = [];
                let yAxis = [];
                let pArray = []
                for(let i=0;i<res.length;i++){
					if(this.boardBase&&i==this.boardBase.lineNum){
						break;
					}
                    xAxis.push(res[i].huowumingcheng);
                    yAxis.push(parseFloat((res[i].total)));
                    pArray.push({
                        value: parseFloat((res[i].total)),
                        name: res[i].huowumingcheng
                    })
                }
                var option = {};
				let titleObj = this.line.title
				titleObj.text = '入库统计'
				
				const legendObj = this.line.legend
				let tooltipObj = { trigger: 'item',formatter: '{b} : {c}'}
				tooltipObj = Object.assign(tooltipObj , this.line.tooltip?this.line.tooltip:{})
				let xAxisObj = this.line.xAxis
				xAxisObj.type = 'category'
				xAxisObj.boundaryGap = false
				xAxisObj.data = xAxis
				
				let yAxisObj = this.line.yAxis
				yAxisObj.type = 'value'
				const gridObj = this.line.grid
				
				let seriesObj = {
					data: yAxis,
					type: 'line',
				}
				seriesObj = Object.assign(seriesObj , this.line.series)
                option = {
					backgroundColor: this.line.backgroundColor,
					color: this.line.color,
                    title: titleObj,
					legend: legendObj,
					grid: gridObj,
                    tooltip: tooltipObj,
                    xAxis: xAxisObj,
                    yAxis: yAxisObj,
                    series: [seriesObj]
                };
                // 使用刚指定的配置项和数据显示图表。
                rukuguanliChart1.setOption(option);
				
                  //根据窗口的大小变动图表
                window.onresize = function() {
                    rukuguanliChart1.resize();
                };
            }
        });
      })
    },


		getchukuguanliCount() {
			this.$http({
				url: `chukuguanli/count`,
				method: "get"
			}).then(({
				data
			}) => {
				if (data && data.code == 0) {
					this.chukuguanliCount = data.data
				}
			})
		},
// 1234 折
		chukuguanliChat1() {
			this.$nextTick(()=>{

        var chukuguanliChart1 = echarts.init(document.getElementById("chukuguanliChart1"),'macarons');
        this.$http({
            url: `chukuguanli/value/huowumingcheng/shuliang`,
            method: "get",
        }).then(({ data }) => {
            if (data && data.code === 0) {
                let res = data.data;
                let xAxis = [];
                let yAxis = [];
                let pArray = []
                for(let i=0;i<res.length;i++){
					if(this.boardBase&&i==this.boardBase.lineNum){
						break;
					}
                    xAxis.push(res[i].huowumingcheng);
                    yAxis.push(parseFloat((res[i].total)));
                    pArray.push({
                        value: parseFloat((res[i].total)),
                        name: res[i].huowumingcheng
                    })
                }
                var option = {};
				let titleObj = this.line.title
				titleObj.text = '出库统计'
				
				const legendObj = this.line.legend
				let tooltipObj = { trigger: 'item',formatter: '{b} : {c}'}
				tooltipObj = Object.assign(tooltipObj , this.line.tooltip?this.line.tooltip:{})
				let xAxisObj = this.line.xAxis
				xAxisObj.type = 'category'
				xAxisObj.boundaryGap = false
				xAxisObj.data = xAxis
				
				let yAxisObj = this.line.yAxis
				yAxisObj.type = 'value'
				const gridObj = this.line.grid
				
				let seriesObj = {
					data: yAxis,
					type: 'line',
				}
				seriesObj = Object.assign(seriesObj , this.line.series)
                option = {
					backgroundColor: this.line.backgroundColor,
					color: this.line.color,
                    title: titleObj,
					legend: legendObj,
					grid: gridObj,
                    tooltip: tooltipObj,
                    xAxis: xAxisObj,
                    yAxis: yAxisObj,
                    series: [seriesObj]
                };
                // 使用刚指定的配置项和数据显示图表。
                chukuguanliChart1.setOption(option);
				
                  //根据窗口的大小变动图表
                window.onresize = function() {
                    chukuguanliChart1.resize();
                };
            }
        });
      })
    },


  }
};
</script>
<style lang="scss" scoped>
    .cardView {
        display: flex;
        flex-wrap: wrap;
        width: 100%;

        .cards {
            display: flex;
            align-items: center;
            width: 100%;
            margin-bottom: 10px;
            justify-content: center;
            .card {
                width: calc(25% - 20px);
                margin: 0 10px;
                /deep/.el-card__body{
                    padding: 0;
                }
            }
        }
    }
	
	// 日历
	.calendar td .text {
				border: 1px solid rgba(51, 63, 136, .1);
				border-radius: 20px;
				flex-direction: column;
				background: rgba(255,255,255,1);
				display: flex;
				width: 100%;
				justify-content: center;
				align-items: center;
				height: 100%;
			}
	.calendar td .text:hover {
				background: #d1d5ef;
			}
	.calendar td .text .new {
				color: inherit;
				font-size: inherit;
				line-height: 1.4;
			}
	.calendar td .text .old {
				color: inherit;
				font-size: inherit;
				line-height: 1.4;
			}
	.calendar td.festival .text {
				border-radius: 20px;
				flex-direction: column;
				background: #e7eaf6;
				display: flex;
				width: 100%;
				justify-content: center;
				align-items: center;
				height: 100%;
			}
	.calendar td.festival .text:hover {
				background: #d1d5ef;
			}
	.calendar td.festival .text .new {
				color: inherit;
				font-size: inherit;
				line-height: 1.4;
			}
	.calendar td.festival .text .old {
				color: inherit;
				font-size: inherit;
				line-height: 1.4;
			}
	.calendar td.other .text {
				border: 0;
				border-radius: 20px;
				flex-direction: column;
				color: #ccc;
				background: none;
				display: flex;
				width: 100%;
				font-size: inherit;
				justify-content: center;
				align-items: center;
				opacity: 1;
				height: 100%;
			}
	.calendar td.other .text:hover {
				background: #d1d5ef;
			}
	.calendar td.other .text .new {
				color: #999;
				font-size: inherit;
				line-height: 1.4;
			}
	.calendar td.other .text .old {
				color: #999;
				font-size: inherit;
				line-height: 1.4;
			}
	.calendar td.today .text {
				border-radius: 20px;
				flex-direction: column;
				color: #fff;
				background: rgba(51,63,136,.8);
				display: flex;
				width: 100%;
				justify-content: center;
				align-items: center;
				height: 100%;
			}
	.calendar td.today .text:hover {
				color: #333;
				background: #d1d5ef;
				opacity: 0.8;
			}
	.calendar td.today .text .new {
				font-size: inherit;
				line-height: 1.4;
			}
	.calendar td.today .text .old {
				font-size: inherit;
				line-height: 1.4;
			}
	
	// echarts1
	.type1 .echarts1 {
				border-radius: 8px;
				padding: 10px;
				box-shadow: inset 0px 0px 32px 0px #E8EFF7,0 3px 6px 0px rgba(100,100,100,.1);
				margin: 0px 0;
				background: rgba(255,255,255,.96);
				width: calc(100% - 0px);
				border-color: #ceddee;
				border-width: 6px 1px 1px;
				position: relative;
				border-style: solid;
				transition: 0.3s;
				height: 486px;
			}
	.type1 .echarts1:hover {
				transform: translate3d(0, 0px, 0);
				z-index: 1;
			}
	// echarts2
	.type2 .echarts1 {
				border-radius: 8px;
				padding: 10px;
				box-shadow: inset 0px 0px 32px 0px #E8EFF7,0 3px 6px 0px rgba(100,100,100,.1);
				margin: 0;
				background: rgba(255,255,255,.96);
				width: 49%;
				border-color: #ceddee;
				border-width: 6px 1px 1px;
				position: relative;
				border-style: solid;
				transition: 0.3s;
				height: 486px;
			}
	.type2 .echarts1:hover {
				box-shadow: 0 1px 3px 0px rgba(115,108,203,.23);
				transform: translate3d(0, 0px, 0);
				z-index: 1;
			}
	.type2 .echarts2 {
				border-radius: 8px;
				padding: 10px;
				box-shadow: inset 0px 0px 32px 0px #E8EFF7,0 3px 6px 0px rgba(100,100,100,.1);
				margin: 0;
				background: rgba(255,255,255,.96);
				width: 49%;
				border-color: #ceddee;
				border-width: 6px 1px 1px;
				position: relative;
				border-style: solid;
				transition: 0.3s;
				height: 486px;
			}
	.type2 .echarts2:hover {
				box-shadow: 0 1px 3px 0px rgba(115,108,203,.23);
				transform: translate3d(0, 0px, 0);
				z-index: 1;
			}
	// echarts3
	.type3 .echarts1 {
				padding: 10px;
				margin: 0 0 30px 0;
				color: #333;
				border-color: #ceddee;
				transition: 0.3s;
				border-radius: 8px;
				box-shadow: inset 0px 0px 32px 0px #E8EFF7,0 3px 6px 0px rgba(100,100,100,.1);
				background: rgba(255,255,255,.96);
				width: 100%;
				border-width: 6px 1px 1px;
				position: relative;
				border-style: solid;
				height: 488px;
			}
	.type3 .echarts1:hover {
				transform: translate3d(0, 0px, 0);
				z-index: 1;
			}
	.type3 .echarts2 {
				border-radius: 8px;
				padding: 10px;
				box-shadow: inset 0px 0px 32px 0px #E8EFF7,0 3px 6px 0px rgba(100,100,100,.1);
				margin: 0 0 30px 0;
				background: rgba(255,255,255,.96);
				width: 49%;
				border-color: #ceddee;
				border-width: 6px 1px 1px;
				position: relative;
				border-style: solid;
				transition: 0.3s;
				height: 360px;
			}
	.type3 .echarts2:hover {
				transform: translate3d(0, 0px, 0);
				z-index: 1;
			}
	.type3 .echarts3 {
				border-radius: 8px;
				padding: 10px;
				box-shadow: inset 0px 0px 32px 0px #E8EFF7,0 3px 6px 0px rgba(100,100,100,.1);
				margin: 0;
				background: rgba(255,255,255,.96);
				width: 49%;
				border-color: #ceddee;
				border-width: 6px 1px 1px;
				position: relative;
				border-style: solid;
				transition: 0.3s;
				height: 360px;
			}
	.type3 .echarts3:hover {
				transform: translate3d(0, 0px, 0);
				z-index: 1;
			}
	// echarts4
	.type4 .echarts1 {
				border-radius: 8px;
				padding: 10px;
				box-shadow: inset 0px 0px 32px 0px #E8EFF7,0 3px 6px 0px rgba(100,100,100,.1);
				margin: 0px 0 30px;
				background: rgba(255,255,255,.96);
				width: 49%;
				border-color: #ceddee;
				border-width: 6px 1px 1px;
				position: relative;
				border-style: solid;
				transition: 0.3s;
				height: 360px;
			}
	.type4 .echarts1:hover {
				box-shadow: 0 1px 3px 0px rgba(115,108,203,.23);
				transform: translate3d(0, 0px, 0);
				z-index: 1;
			}
	.type4 .echarts2 {
				border-radius: 8px;
				padding: 10px;
				box-shadow: inset 0px 0px 32px 0px #E8EFF7,0 3px 6px 0px rgba(100,100,100,.1);
				margin: 0px 0 30px;
				background: rgba(255,255,255,.96);
				width: 49%;
				border-color: #ceddee;
				border-width: 6px 1px 1px;
				position: relative;
				border-style: solid;
				transition: 0.3s;
				height: 360px;
			}
	.type4 .echarts2:hover {
				box-shadow: 0 1px 3px 0px rgba(115,108,203,.23);
				transform: translate3d(0, 0px, 0);
				z-index: 1;
			}
	.type4 .echarts3 {
				border-radius: 8px;
				padding: 10px;
				box-shadow: inset 0px 0px 32px 0px #E8EFF7,0 3px 6px 0px rgba(100,100,100,.1);
				margin: 0px 0 30px;
				background: rgba(255,255,255,.96);
				width: 49%;
				border-color: #ceddee;
				border-width: 6px 1px 1px;
				position: relative;
				border-style: solid;
				transition: 0.3s;
				height: 360px;
			}
	.type4 .echarts3:hover {
				box-shadow: 0 1px 3px 0px rgba(115,108,203,.23);
				transform: translate3d(0, 0px, 0);
				z-index: 1;
			}
	.type4 .echarts4 {
				border-radius: 8px;
				padding: 10px;
				box-shadow: inset 0px 0px 32px 0px #E8EFF7,0 3px 6px 0px rgba(100,100,100,.1);
				margin: 0px 0 30px;
				background: rgba(255,255,255,.96);
				width: 49%;
				border-color: #ceddee;
				border-width: 6px 1px 1px;
				position: relative;
				border-style: solid;
				transition: 0.3s;
				height: 360px;
			}
	.type4 .echarts4:hover {
				transform: translate3d(0, 0px, 0);
				z-index: 1;
			}
	// echarts5
	.type5 .echarts1 {
				border-radius: 8px;
				padding: 10px;
				box-shadow: inset 0px 0px 32px 0px #E8EFF7,0 3px 6px 0px rgba(100,100,100,.1);
				margin: 0px 0 20px;
				background: rgba(255,255,255,.96);
				width: 100%;
				border-color: #ceddee;
				border-width: 6px 1px 1px;
				position: relative;
				border-style: solid;
				transition: 0.3s;
				height: 360px;
			}
	.type5 .echarts1:hover {
				box-shadow: 0 1px 3px 0px rgba(115,108,203,.23);
				transform: translate3d(0, 0px, 0);
				z-index: 1;
			}
	.type5 .echarts2 {
				border-radius: 8px;
				padding: 10px;
				box-shadow: inset 0px 0px 32px 0px #E8EFF7,0 3px 6px 0px rgba(100,100,100,.1);
				margin: 0px 0 30px;
				background: rgba(255,255,255,.96);
				width: 49%;
				border-color: #ceddee;
				border-width: 6px 1px 1px;
				position: relative;
				border-style: solid;
				transition: 0.3s;
				height: 360px;
			}
	.type5 .echarts2:hover {
				box-shadow: 0 1px 3px 0px rgba(115,108,203,.23);
				transform: translate3d(0, 0px, 0);
				z-index: 1;
			}
	.type5 .echarts3 {
				border-radius: 8px;
				padding: 10px;
				box-shadow: inset 0px 0px 32px 0px #E8EFF7,0 3px 6px 0px rgba(100,100,100,.1);
				margin: 0px 0 20px;
				background: rgba(255,255,255,.96);
				width: 49%;
				border-color: #ceddee;
				border-width: 6px 1px 1px;
				position: relative;
				border-style: solid;
				transition: 0.3s;
				height: 360px;
			}
	.type5 .echarts3:hover {
				box-shadow: 0 1px 3px 0px rgba(115,108,203,.23);
				transform: translate3d(0, 0px, 0);
				z-index: 1;
			}
	.type5 .echarts4 {
				border-radius: 8px;
				padding: 10px;
				box-shadow: inset 0px 0px 32px 0px #E8EFF7,0 3px 6px 0px rgba(100,100,100,.1);
				margin: 0px 0 20px;
				background: rgba(255,255,255,.96);
				width: 49%;
				border-color: #ceddee;
				border-width: 6px 1px 1px;
				position: relative;
				border-style: solid;
				transition: 0.3s;
				height: 360px;
			}
	.type5 .echarts4:hover {
				box-shadow: 0 1px 3px 0px rgba(115,108,203,.23);
				transform: translate3d(0, 0px, 0);
				z-index: 1;
			}
	.type5 .echarts5 {
				border-radius: 8px;
				padding: 10px;
				box-shadow: inset 0px 0px 32px 0px #E8EFF7,0 3px 6px 0px rgba(100,100,100,.1);
				margin: 0px 0 20px;
				background: rgba(255,255,255,.96);
				width: 49%;
				border-color: #ceddee;
				border-width: 6px 1px 1px;
				position: relative;
				border-style: solid;
				transition: 0.3s;
				height: 360px;
			}
	.type5 .echarts5:hover {
				box-shadow: 0 3px 6px 0px rgba(100,100,100,.1);
				transform: translate3d(0, 0px, 0);
				z-index: 1;
			}
	
	.echarts-flag-2 {
	  display: flex;
	  flex-wrap: wrap;
	  justify-content: space-between;
	  padding: 10px 20px;
	  background: rebeccapurple;
	
	  &>div {
	    width: 32%;
	    height: 300px;
	    margin: 10px 0;
	    background: rgba(255,255,255,.1);
	    border-radius: 8px;
	    padding: 10px 20px;
	  }
	}
</style>
