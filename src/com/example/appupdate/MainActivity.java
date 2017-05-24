package com.example.appupdate;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		//创建下载任务,downloadUrl就是下载链接
		DownloadManager.Request request = new DownloadManager.Request(Uri.parse("http://134.64.109.25:3030/SaleWeb/www/images/xsmj/iPhone5s1.jpg"));
		//指定下载路径和下载文件名
		
		request.setDestinationInExternalPublicDir("/Esale/", "Esale.jpg");
		//获取下载管理器
		DownloadManager downloadManager= (DownloadManager) getApplicationContext().getSystemService(Context.DOWNLOAD_SERVICE);
		//将下载任务加入下载队列，否则不会进行下载
		downloadManager.enqueue(request);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
