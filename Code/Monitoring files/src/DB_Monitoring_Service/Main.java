
package DB_Monitoring_Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

import DB_Monitoring_Service.Custom_Data_Type.DeviceInfo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Main
{
	
	void test() 
	{
 		int beaconNumber = 0; 
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		 
        for (int i = 0; i < beaconNumber; i++) {
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
 
                    int poolSize = threadPoolExecutor.getPoolSize();
                    String threadName = Thread.currentThread().getName();
                }
            };
 
            executorService.execute(runnable);
            // executorService.submit(runnable);
 
            try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        executorService.shutdown();
        
	}

    public static void main(String[] args) throws IOException
    {
    	
        // TODO Auto-generated method stub
        MutiThreadMode();
        
    	//FirebaseStorage fbs = new FirebaseStorage();
        //fbs.FirebaseConnet();
        //fbs.isRidding(false, "40001", "30530");
        //fbs.Log();
        //fbs.busSensorDataModify();
    }

    private static void MutiThreadMode()
    {

        System.out.println("����͸� ����");
        mysql m = null;
        PushService ps = null;

        int beforeMembers = -1;

        int frequency = 1; // ������ �ֱ�
        int maximum = 20; // 1�е��� ������ �ִ� ���� �ȿ� �����ؾ� Ƚ��
        int count = 15; // 1�е��� ž�� ���� �ȿ� �����ؾ� Ƚ��
        double limitAccuracy_on = 2.5;  // ž�� ���� (������ Accuracy��)
        double limitAccuracy_off = 4.0; //

        double limitTemperature = 30.0; // ���� �µ�


        // ���� �� ��ĵ
        SensorMonitoring sm = new SensorMonitoring(limitTemperature);
        sm.start();



    }
}
