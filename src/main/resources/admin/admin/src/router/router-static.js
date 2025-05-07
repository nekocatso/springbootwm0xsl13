import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import yuangong from '@/views/modules/yuangong/list'
    import gongyingshang from '@/views/modules/gongyingshang/list'
    import chukuguanli from '@/views/modules/chukuguanli/list'
    import huowuxinxi from '@/views/modules/huowuxinxi/list'
    import huowuleixing from '@/views/modules/huowuleixing/list'
    import rukuguanli from '@/views/modules/rukuguanli/list'
    import kucunpandian from '@/views/modules/kucunpandian/list'
    import cangkuxinxi from '@/views/modules/cangkuxinxi/list'


//2.配置路由   注意：名字
export const routes = [{
    path: '/',
    name: '系统首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '系统首页',
      component: Home,
      meta: {icon:'', title:'center', affix: true}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/yuangong',
        name: '员工',
        component: yuangong
      }
      ,{
	path: '/gongyingshang',
        name: '供应商',
        component: gongyingshang
      }
      ,{
	path: '/chukuguanli',
        name: '出库管理',
        component: chukuguanli
      }
      ,{
	path: '/huowuxinxi',
        name: '货物信息',
        component: huowuxinxi
      }
      ,{
	path: '/huowuleixing',
        name: '货物类型',
        component: huowuleixing
      }
      ,{
	path: '/rukuguanli',
        name: '入库管理',
        component: rukuguanli
      }
      ,{
	path: '/kucunpandian',
        name: '库存盘点',
        component: kucunpandian
      }
      ,{
	path: '/cangkuxinxi',
        name: '仓库信息',
        component: cangkuxinxi
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})
const originalPush = VueRouter.prototype.push
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
   return originalPush.call(this, location).catch(err => err)
}
export default router;
