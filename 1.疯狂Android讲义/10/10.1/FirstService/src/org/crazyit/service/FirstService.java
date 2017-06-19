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
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
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
	// ����ʵ�ֵķ���
	@Override
	public IBinder onBind(Intent arg0)
	{
		return null;
	}
	// Service������ʱ�ص��÷�����
	@Override
	public void onCreate()
	{
		super.onCreate();
		Log.e(TAG,"Service is onCreate()");
	}
	// Service������ʱ�ص��÷���
	@Override
	public int onStartCommand(Intent intent, int flags, int startId)
	{
		Log.e(TAG,"Service is onStartCommand()");
		return START_STICKY;
	}
	// Service���ر�֮ǰ�ص���
	@Override
	public void onDestroy()
	{
		super.onDestroy();
		Log.e(TAG,"Service is onDestroy()");
	}
}
