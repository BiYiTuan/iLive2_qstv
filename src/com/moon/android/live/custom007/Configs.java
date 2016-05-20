package com.moon.android.live.custom007;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.os.Environment;
import android.widget.Switch;

import com.moon.android.live.custom007.util.MACUtils;

public class Configs {
	
	public static final boolean debug = true;
	public static final boolean isShowClassify = true;
	public static final String APPID = "100005";
	public static final String PKG_NAME = "com.moon.android.launcher.custom007";
	
	public static final String SERVER = "http://qshdwcam.tvboxadmin.com:9023";
//	public static final String SERVER = "http://qshd.hdwcam.com:9023";
	public static String link;
	public static String key;
	public static String chip;
	public final String SERVER_HTTPS_ADDRESS = getHttpsServer();
	public final String SERVER_HTTPS_ADDRESS02 = getHttpsServer02();
	public final String SERVER_HTTPS_ADDRESS03 = getHttpsServer03();
	public final String SERVER_HTTP_ADDRESS = getHttpServer01();
	
	public static final int NETWORK_NOT_CONNECT = 0x25025001;
	public static final int NETWORK_CONNECT = 0x25025002;
	public static final int AUTH_STOP = 0x25025003;
	public static final int AUTH_FAIL = 0x25025004;
	public static final int SUCCESS = 0x25025005;
	public static final int FAIL = 0x25025006;
	public static final int VIDEO_PLAY = 0x25025007;
	public static final int NETWORK_EXCEPTION = 0x25025008;
	public static final int CONTENT_IS_NULL = 0x25025009;
	public static final int LOAD_DATA_SUCCESS = 0x25025010;
	public static final int AUTH_SUCCESS_CACHE = 0x25025011;
	public static final int VOD_CAN_PLAY = 0x25025012;
	public static final int AUTH_FAIL_FINISH = 0x25025013;
	public static final int AUTH_SUCCESS_NETWORK = 0x25025014;
	public static final int READ_CACHE = 0x25025015;
	public static final int EXIT = 0x25025016;
	public static final int FORCE_SO_LOADED = 0x25025017;
	public static final int AD_SHOW_FINISH = 0x25025018;
	
	
	public static final String APK_NAME="update.apk";
	public static final String INTENT_PARAM = "intent_param";
	public static final String INTENT_PARAM02 = "intent_param2";
	
	public class RequestUrl{
		public List<String> mListAuthAdress = new ArrayList<String>();
		public RequestUrl(){
			mListAuthAdress.add(VOD_CHECK_AUTH);
			mListAuthAdress.add(VOD_CHECK_AUTH02);
			mListAuthAdress.add(VOD_CHECK_AUTH03);
		}
		public  final String AUTH_PARAMTER = "mac=" + MACUtils.getMac() + "&appid=" + Configs.APPID+"&jsontype=2";
		private  final String VOD_CHECK_AUTH = SERVER_HTTPS_ADDRESS +"/index.php/Api/auth?" + AUTH_PARAMTER;
		private  final String VOD_CHECK_AUTH02 = SERVER_HTTPS_ADDRESS02 +"/index.php/Api/auth?"+ AUTH_PARAMTER;
		private  final String VOD_CHECK_AUTH03 = SERVER_HTTPS_ADDRESS03 +"/index.php/Api/auth?"+ AUTH_PARAMTER;
		public  final String APP_MSG = SERVER_HTTPS_ADDRESS + "/index.php/Api/App/appmsg?";
		public  final String UPGRADE = SERVER_HTTPS_ADDRESS +"/index.php/Api/App/upgrade?";
		public  final String SERVER_01="http://23.89.145.178:9023";
		public List<String> mListGetAd = new ArrayList<String>(){
			/**
			 * 
			 */
			private static final long serialVersionUID = -4873322469368178428L;

			{
				add(SERVER_01 + "/Api/Ad?type=1&mac="+MACUtils.getMac()+"&jid=");
				add(SERVER_01 + "/Api/Ad?type=1&mac="+MACUtils.getMac()+"&jid=");
				add(SERVER_01 + "/Api/Ad?type=1&mac="+MACUtils.getMac()+"&jid=");
			}
		};
		
	}
	
	
	public static class BroadCast{
		public static final String UPDATE_MSG = PKG_NAME + ".update";
		public static final String APP_GET_MSG = PKG_NAME + ".msg";
		
	}
	
	public static class Force{
		public static final int Force_request_success = 0;
	}
	
	public static final String APP_DATA_PATH = "/data"
			+ Environment.getDataDirectory().getAbsolutePath() + "/"
			+ PKG_NAME+ "/";
	
//	public static final String CONTENT_CACHE_FILE = MyApplication.getApplication().getCacheDir() .getAbsolutePath() +"/just"+APPID;
	public static String getCacheFile(Context context){
		return context.getApplicationContext().getCacheDir().getAbsoluteFile()+"/just"+APPID;
	}
//	public static final String AD_CACHE_FILE = MyApplication.getApplication().getCacheDir() .getAbsolutePath() +"/just"+APPID;
	
	public static final String getContentCachaFile(Context context){
		return context.getExternalCacheDir().getAbsolutePath();
	}
	
	public static final String WHITE_URL = "http://api.cloudtv.bz/v3/fire_login/1/";
	public final String HBS = SERVER_HTTP_ADDRESS + "/index.php/Api/App/Beat?appid="+APPID;
	
	public native String getHttpsServer();
	public native String getHttpsServer02(); 
	public native String getHttpsServer03();
	public native String getHttpServer01();
	
	static{
		System.loadLibrary("moon");
	}
}
