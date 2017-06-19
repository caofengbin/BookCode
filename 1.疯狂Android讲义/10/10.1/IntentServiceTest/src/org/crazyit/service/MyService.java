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
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class MyService extends Service
{
	private static final String TAG = "servicetest";
	
	@Override
	public IBinder onBind(Intent intent)
	{
		return null;
	}

	@Override
	public int onStartCommand(Intent intent, int flags, int startId)
	{
		// �÷�����ִ�к�ʱ������ܵ���ANR��Application Not Responding���쳣
		long endTime = System.currentTimeMillis() + 20 * 1000;
		Log.e(TAG,"onStartCommand() been called");
		while (System.currentTimeMillis() < endTime)
		{
			synchronized (this)
			{
				try
				{
					wait(endTime - System.currentTimeMillis());
				}
				catch (Exception e)
				{
				}
			}
		}
		Log.e(TAG,"---��ʱ����ִ�����---");
		return START_STICKY;
	}
}
