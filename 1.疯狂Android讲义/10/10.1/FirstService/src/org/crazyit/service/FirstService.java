/**
 *
 */
package org.crazyit.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

/**
 * Description:
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>Copyright (C), 2001-2014, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class FirstService extends Service
{
	private static final String TAG = "FirstService";
	// 必须实现的方法
	@Override
	public IBinder onBind(Intent arg0)
	{
		return null;
	}
	// Service被创建时回调该方法。
	@Override
	public void onCreate()
	{
		super.onCreate();
		Log.e(TAG,"Service is onCreate()");
	}
	// Service被启动时回调该方法
	@Override
	public int onStartCommand(Intent intent, int flags, int startId)
	{
		Log.e(TAG,"Service is onStartCommand()");
		return START_STICKY;
	}
	// Service被关闭之前回调。
	@Override
	public void onDestroy()
	{
		super.onDestroy();
		Log.e(TAG,"Service is onDestroy()");
	}
}
