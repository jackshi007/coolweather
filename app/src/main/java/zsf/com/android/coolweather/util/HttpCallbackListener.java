package zsf.com.android.coolweather.util;

/**
 * Created by zhangsf on 16-10-13.
 */

public interface HttpCallbackListener {
    void onFinish(String reponse);

    void onError(Exception e);
}
