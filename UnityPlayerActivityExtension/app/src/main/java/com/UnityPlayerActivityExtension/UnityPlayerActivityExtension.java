
package com.UnityPlayerActivityExtension;

import android.app.Activity;
import android.widget.TextView;
import android.os.Bundle;

public class UnityPlayerActivityExtension extends Activity
{
    /** �۾��� ó�� ������� �� ȣ��˴ϴ�. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        /* TextView�� ����� �ؽ�Ʈ�� "Hello world"�� �����մϴ�.*/
        TextView  tv = new TextView(this);
        tv.setText("Hello World!");
        setContentView(tv);
    }
}
