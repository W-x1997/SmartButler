# SmartButler
应用简介：smartBulter是一款生活工具类app，带有一些当下流行的实用功能。
适合新手练手学习，比较基础。
安卓四大组件：Activity，Service，ContentProvider（第三方后台Bmob），BroadcastReceiver 

具体功能：实现有后台的登录（Bmob），注册，修改密码；机器人语言聊天（科大讯飞TTs引擎）；
百度地图的定位集成（百度SDK）；手机号码归属地查询（聚合数据）；微信精选浏览；快递查询，图片的网络加载（Picasso），Revolly网络请求。 


项目结构框架介绍： 
建立了八个包，下面一次介绍每个包的内容： 
adapter：主要放各个板块listview的适配器 
application：基础的Baseapplication 
entity： 具体的数据类 
fragment：四个板块的碎片 
service：短信的接发送服务 
ui：主要用于存放各个activity 
utils：封装的各个工具类 
view：自定义的dialog 
jinlibs，libs：第三方库的支持 
libzxing：第三方库的支持（二维码） 

项目所用的第三方： 
后台：采用当下较为流行的Bmob 


语音机器人聊天：科大讯飞TTs引擎 

微信精选等小功能：聚合数据提供的接口 

二维码的生成：Zxing架包 

图片的网络加载：采用picasso 


简单说明： 
ChatListAdapter：  机器人聊天界面listview的适配器 
CourierAdapter：   快递物流查询返回信息listview显示的适配器 
GridAdapter：      第三个板块加载图片的适配器 
WechatAdaper： 微信精选内容的适配器

BaseApplication：基础的application，实现简单的第三方的导入和sdk的初始化 

ChatListData：聊天的数据实体 
CourierData：  物流查询数据返回的实体 
MyUser：  用户的信息实体 
WechatData：微信精选 

SmsService：短信的接受与发送 

AboutActivity: 对这个app的简单解释 
BaseActivity:  实现菜单栏的操作与返回键 被其他activity继承 
CourierActivity: 快递查询 
LocationAcitivity: 百度定位 
LoginActivity:  登录界面 
PhoneActivty:  电话号码归属地查询 
QrCodeActivity:  二维码生成 
RegisterActivity:  注册界面 
SettingActivity: 一些设置 
WebViewActivity:  网页加载微信精选内容 

L:log方法的封装 
Share Utils：sharedpreferences的封装 
PicassoUtils: 加载在网络图片操作的方法封装 
StaticClass:一些key和数据常量的保存 
utilTools:一些重复使用的工具方法的封装，比如图片保存和字体设置Typeface 
CustomDialog:自定义Dialog 
DispatchLinearLayout:事件分发 
