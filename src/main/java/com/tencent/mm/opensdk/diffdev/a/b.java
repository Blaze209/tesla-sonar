package com.tencent.mm.opensdk.diffdev.a;

import android.os.AsyncTask;
import android.util.Base64;
import com.tencent.mm.opensdk.diffdev.OAuthErrCode;
import com.tencent.mm.opensdk.diffdev.OAuthListener;
import com.tencent.mm.opensdk.utils.Log;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class b extends AsyncTask<Void, Void, a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f55542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f55543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f55544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f55545d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f55546e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private OAuthListener f55547f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private c f55548g;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public OAuthErrCode f55549a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f55550b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f55551c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f55552d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte[] f55553e;

        private a() {
        }

        public static a a(byte[] bArr) {
            OAuthErrCode oAuthErrCode;
            String str;
            a aVar = new a();
            if (bArr == null || bArr.length == 0) {
                Log.e("MicroMsg.SDK.GetQRCodeResult", "parse fail, buf is null");
                oAuthErrCode = OAuthErrCode.WechatAuth_Err_NetworkErr;
            } else {
                try {
                    try {
                        JSONObject jSONObject = new JSONObject(new String(bArr, "utf-8"));
                        int i11 = jSONObject.getInt("errcode");
                        if (i11 != 0) {
                            Log.e("MicroMsg.SDK.GetQRCodeResult", String.format("resp errcode = %d", Integer.valueOf(i11)));
                            aVar.f55549a = OAuthErrCode.WechatAuth_Err_NormalErr;
                            jSONObject.optString("errmsg");
                            return aVar;
                        }
                        String string = jSONObject.getJSONObject("qrcode").getString("qrcodebase64");
                        if (string == null || string.length() == 0) {
                            Log.e("MicroMsg.SDK.GetQRCodeResult", "parse fail, qrcodeBase64 is null");
                        } else {
                            byte[] bArrDecode = Base64.decode(string, 0);
                            if (bArrDecode != null && bArrDecode.length != 0) {
                                aVar.f55549a = OAuthErrCode.WechatAuth_Err_OK;
                                aVar.f55553e = bArrDecode;
                                aVar.f55550b = jSONObject.getString("uuid");
                                String string2 = jSONObject.getString("appname");
                                aVar.f55551c = string2;
                                Log.d("MicroMsg.SDK.GetQRCodeResult", String.format("parse succ, save in memory, uuid = %s, appname = %s, imgBufLength = %d", aVar.f55550b, string2, Integer.valueOf(aVar.f55553e.length)));
                                return aVar;
                            }
                            Log.e("MicroMsg.SDK.GetQRCodeResult", "parse fail, qrcodeBuf is null");
                        }
                        aVar.f55549a = OAuthErrCode.WechatAuth_Err_JsonDecodeErr;
                        return aVar;
                    } catch (Exception e11) {
                        str = String.format("parse json fail, ex = %s", e11.getMessage());
                        Log.e("MicroMsg.SDK.GetQRCodeResult", str);
                        oAuthErrCode = OAuthErrCode.WechatAuth_Err_NormalErr;
                        aVar.f55549a = oAuthErrCode;
                        return aVar;
                    }
                } catch (Exception e12) {
                    str = String.format("parse fail, build String fail, ex = %s", e12.getMessage());
                }
            }
            aVar.f55549a = oAuthErrCode;
            return aVar;
        }
    }

    public b(String str, String str2, String str3, String str4, String str5, OAuthListener oAuthListener) {
        this.f55542a = str;
        this.f55543b = str2;
        this.f55544c = str3;
        this.f55545d = str4;
        this.f55546e = str5;
        this.f55547f = oAuthListener;
    }

    public boolean a() {
        Log.i("MicroMsg.SDK.GetQRCodeTask", "cancelTask");
        c cVar = this.f55548g;
        return cVar == null ? cancel(true) : cVar.cancel(true);
    }

    @Override // android.os.AsyncTask
    protected a doInBackground(Void[] voidArr) throws Throwable {
        Thread.currentThread().setName("OpenSdkGetQRCodeTask");
        Log.i("MicroMsg.SDK.GetQRCodeTask", "doInBackground");
        String str = String.format("https://open.weixin.qq.com/connect/sdk/qrconnect?appid=%s&noncestr=%s&timestamp=%s&scope=%s&signature=%s", this.f55542a, this.f55544c, this.f55545d, this.f55543b, this.f55546e);
        long jCurrentTimeMillis = System.currentTimeMillis();
        byte[] bArrA = com.tencent.mm.opensdk.channel.a.a.a(str, 60000);
        Log.d("MicroMsg.SDK.GetQRCodeTask", String.format("doInBackground, url = %s, time consumed = %d(ms)", str, Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)));
        return a.a(bArrA);
    }

    @Override // android.os.AsyncTask
    protected void onPostExecute(a aVar) {
        a aVar2 = aVar;
        OAuthErrCode oAuthErrCode = aVar2.f55549a;
        if (oAuthErrCode != OAuthErrCode.WechatAuth_Err_OK) {
            Log.e("MicroMsg.SDK.GetQRCodeTask", String.format("onPostExecute, get qrcode fail, OAuthErrCode = %s", oAuthErrCode));
            this.f55547f.onAuthFinish(aVar2.f55549a, null);
            return;
        }
        Log.d("MicroMsg.SDK.GetQRCodeTask", "onPostExecute, get qrcode success imgBufSize = " + aVar2.f55553e.length);
        this.f55547f.onAuthGotQrcode(aVar2.f55552d, aVar2.f55553e);
        c cVar = new c(aVar2.f55550b, this.f55547f);
        this.f55548g = cVar;
        cVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }
}
