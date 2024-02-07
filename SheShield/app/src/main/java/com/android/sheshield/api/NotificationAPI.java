package com.android.sheshield.api;

import com.android.sheshield.model.NotificationSenderModel;
import com.android.sheshield.util.NotificationResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface NotificationAPI {

    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAuyiNHS4:APA91bG0P0tcmXWu6Ow0x5H7ukSDLKQ2Hr3U68opqX9GElFsfROchd6N58lTR-BKO_sW9WTdzfp830KVPqKYew78Gx7iVCFoSCAfdKl-V6Gf47YErV3SxY9YyKi6zt0kj-fmHzaPM-on" // Replace with your server key from Firebase Console
            }
    )

    @POST("fcm/send")
    Call<NotificationResponse> sendNotification(@Body NotificationSenderModel body);
}
