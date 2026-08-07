package fh;

import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;

/* JADX INFO: loaded from: classes3.dex */
public enum c {
    SUCCEEDED(9000, "处理成功"),
    FAILED(4000, "系统繁忙，请稍后再试"),
    CANCELED(6001, "用户取消"),
    NETWORK_ERROR(6002, "网络连接异常"),
    ACTIVITY_NOT_START_EXIT(6007, "支付未完成"),
    PARAMS_ERROR(4001, "参数错误"),
    DOUBLE_REQUEST(5000, "重复请求"),
    PAY_WAITTING(ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED, "支付结果确认中");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f65961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f65962b;

    c(int i11, String str) {
        this.f65961a = i11;
        this.f65962b = str;
    }

    public void b(int i11) {
        this.f65961a = i11;
    }

    public int c() {
        return this.f65961a;
    }

    public void a(String str) {
        this.f65962b = str;
    }

    public String b() {
        return this.f65962b;
    }

    public static c a(int i11) {
        if (i11 == 4001) {
            return PARAMS_ERROR;
        }
        if (i11 == 5000) {
            return DOUBLE_REQUEST;
        }
        if (i11 == 8000) {
            return PAY_WAITTING;
        }
        if (i11 == 9000) {
            return SUCCEEDED;
        }
        if (i11 == 6001) {
            return CANCELED;
        }
        if (i11 != 6002) {
            return FAILED;
        }
        return NETWORK_ERROR;
    }
}
