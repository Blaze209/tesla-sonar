package com.alipay.android.phone.mrpc.core.a;

import android.util.Log;
import com.alipay.android.phone.mrpc.core.RpcException;
import java.util.ArrayList;
import okhttp3.HttpUrl;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

/* JADX INFO: loaded from: classes3.dex */
public class e extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f19972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f19973d;

    public e(int i11, String str, Object obj) {
        super(str, obj);
        this.f19972c = i11;
    }

    @Override // com.alipay.android.phone.mrpc.core.a.f
    public void a(Object obj) {
        this.f19973d = obj;
    }

    @Override // com.alipay.android.phone.mrpc.core.a.f
    public byte[] a() {
        try {
            ArrayList arrayList = new ArrayList();
            if (this.f19973d != null) {
                arrayList.add(new BasicNameValuePair("extParam", vg.a.b(this.f19973d)));
            }
            arrayList.add(new BasicNameValuePair("operationType", this.f19970a));
            arrayList.add(new BasicNameValuePair("id", this.f19972c + ""));
            Log.d("JsonSerializer", "mParams is:" + this.f19971b);
            Object obj = this.f19971b;
            arrayList.add(new BasicNameValuePair("requestData", obj == null ? HttpUrl.PATH_SEGMENT_ENCODE_SET_URI : vg.a.b(obj)));
            String str = URLEncodedUtils.format(arrayList, "utf-8");
            Log.i("JsonSerializer", "request = " + str);
            return str.getBytes();
        } catch (Exception e11) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("request  =");
            sb2.append(this.f19971b);
            sb2.append(":");
            sb2.append(e11);
            throw new RpcException(9, sb2.toString() != null ? e11.getMessage() : "", e11);
        }
    }
}
