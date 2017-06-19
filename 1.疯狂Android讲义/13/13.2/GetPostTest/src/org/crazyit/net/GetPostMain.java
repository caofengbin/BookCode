package org.crazyit.net;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class GetPostMain extends Activity
{
	Button get , post;
	TextView show;
	// �����������Ӧ���ַ���
	String response;
	Handler handler = new Handler()
	{
		@Override
		public void handleMessage(Message msg)
		{
			if(msg.what == 0x123)
			{
				// ����show�����ʾ��������Ӧ
				show.setText(response);
			}
		}
	};
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		get = (Button) findViewById(R.id.get);
		post = (Button) findViewById(R.id.post);
		show = (TextView)findViewById(R.id.show);
		get.setOnClickListener(new OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				new Thread()
				{
					@Override
					public void run()
					{
						response = GetPostUtil.sendGet(
							"http://111.15.145.155:8080/abc/a.jsp"
							, null);
						// ������Ϣ֪ͨUI�̸߳���UI���
						handler.sendEmptyMessage(0x123);
					}
				}.start();
			}
		});
		post.setOnClickListener(new OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				new Thread()
				{
					@Override
					public void run()
					{
						response = GetPostUtil.sendPost(
							"http://111.15.145.155:8080/abc/login.jsp"
							, "name=crazyit.org&pass=leegang");
					}
				}.start();
				// ������Ϣ֪ͨUI�̸߳���UI���
				handler.sendEmptyMessage(0x123);
			}
		});
	}
}