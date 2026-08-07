package com.tencent.mm.opensdk.diffdev.a;

import android.os.AsyncTask;
import com.google.android.gms.wallet.WalletConstants;
import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import com.tencent.mm.opensdk.diffdev.OAuthErrCode;
import com.tencent.mm.opensdk.diffdev.OAuthListener;
import com.tencent.mm.opensdk.utils.Log;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
class c extends AsyncTask<Void, Void, a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f55554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f55555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private OAuthListener f55556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f55557d;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public OAuthErrCode f55558a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f55559b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f55560c;

        a() {
        }
    }

    public c(String str, OAuthListener oAuthListener) {
        this.f55554a = str;
        this.f55556c = oAuthListener;
        this.f55555b = String.format("https://long.open.weixin.qq.com/connect/l/qrconnect?f=json&uuid=%s", str);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00cf A[Catch: Exception -> 0x00c4, TryCatch #1 {Exception -> 0x00c4, blocks: (B:20:0x008b, B:22:0x009a, B:26:0x00b3, B:28:0x00b7, B:31:0x00c6, B:35:0x00d1, B:32:0x00c9, B:33:0x00cc, B:34:0x00cf), top: B:66:0x008b }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0126  */
    /* JADX WARN: Code duplicated, block: B:69:0x0161 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0139 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0132 A[SYNTHETIC] */
    @Override // android.os.AsyncTask
    protected a doInBackground(Void[] voidArr) throws Throwable {
        a aVar;
        OAuthErrCode oAuthErrCode;
        String str;
        OAuthErrCode oAuthErrCode2;
        OAuthErrCode oAuthErrCode3;
        int i11;
        String str2;
        String str3;
        OAuthErrCode oAuthErrCode4;
        Thread.currentThread().setName("OpenSdkNoopingTask");
        String str4 = this.f55554a;
        if (str4 == null || str4.length() == 0) {
            Log.e("MicroMsg.SDK.NoopingTask", "run fail, uuid is null");
            a aVar2 = new a();
            aVar2.f55558a = OAuthErrCode.WechatAuth_Err_NormalErr;
            return aVar2;
        }
        Log.i("MicroMsg.SDK.NoopingTask", "doInBackground start " + isCancelled());
        while (!isCancelled()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f55555b);
            if (this.f55557d == 0) {
                str = "";
            } else {
                str = "&last=" + this.f55557d;
            }
            sb2.append(str);
            String string = sb2.toString();
            long jCurrentTimeMillis = System.currentTimeMillis();
            byte[] bArrA = com.tencent.mm.opensdk.channel.a.a.a(string, 60000);
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            aVar = new a();
            Log.d("MicroMsg.SDK.NoopingResult", "star parse NoopingResult");
            if (bArrA != null && bArrA.length != 0) {
                try {
                    try {
                        JSONObject jSONObject = new JSONObject(new String(bArrA, "utf-8"));
                        int i12 = jSONObject.getInt("wx_errcode");
                        aVar.f55560c = i12;
                        Log.d("MicroMsg.SDK.NoopingResult", String.format("nooping uuidStatusCode = %d", Integer.valueOf(i12)));
                        int i13 = aVar.f55560c;
                        if (i13 == 408) {
                            oAuthErrCode4 = OAuthErrCode.WechatAuth_Err_OK;
                            aVar.f55558a = oAuthErrCode4;
                        } else if (i13 != 500) {
                            switch (i13) {
                                case WalletConstants.ERROR_CODE_SERVICE_UNAVAILABLE /* 402 */:
                                    oAuthErrCode4 = OAuthErrCode.WechatAuth_Err_Timeout;
                                    aVar.f55558a = oAuthErrCode4;
                                    break;
                                case DownloaderService.STATUS_FORBIDDEN /* 403 */:
                                    oAuthErrCode4 = OAuthErrCode.WechatAuth_Err_Cancel;
                                    aVar.f55558a = oAuthErrCode4;
                                    break;
                                case 404:
                                    oAuthErrCode4 = OAuthErrCode.WechatAuth_Err_OK;
                                    aVar.f55558a = oAuthErrCode4;
                                    break;
                                case WalletConstants.ERROR_CODE_MERCHANT_ACCOUNT_ERROR /* 405 */:
                                    aVar.f55558a = OAuthErrCode.WechatAuth_Err_OK;
                                    aVar.f55559b = jSONObject.getString("wx_code");
                                    break;
                                default:
                                    oAuthErrCode4 = OAuthErrCode.WechatAuth_Err_NormalErr;
                                    aVar.f55558a = oAuthErrCode4;
                                    break;
                            }
                        } else {
                            oAuthErrCode4 = OAuthErrCode.WechatAuth_Err_NormalErr;
                            aVar.f55558a = oAuthErrCode4;
                        }
                    } catch (Exception e11) {
                        str3 = String.format("parse json fail, ex = %s", e11.getMessage());
                        Log.e("MicroMsg.SDK.NoopingResult", str3);
                        oAuthErrCode2 = OAuthErrCode.WechatAuth_Err_NormalErr;
                        aVar.f55558a = oAuthErrCode2;
                    }
                } catch (Exception e12) {
                    str3 = String.format("parse fail, build String fail, ex = %s", e12.getMessage());
                }
                Log.d("MicroMsg.SDK.NoopingTask", String.format("nooping, url = %s, errCode = %s, uuidStatusCode = %d, time consumed = %d(ms)", string, aVar.f55558a.toString(), Integer.valueOf(aVar.f55560c), Long.valueOf(jCurrentTimeMillis2 - jCurrentTimeMillis)));
                oAuthErrCode3 = aVar.f55558a;
                if (oAuthErrCode3 == OAuthErrCode.WechatAuth_Err_OK) {
                    i11 = aVar.f55560c;
                    this.f55557d = i11;
                    if (i11 == d.UUID_SCANED.a()) {
                        this.f55556c.onQrcodeScanned();
                    } else if (aVar.f55560c == d.UUID_KEEP_CONNECT.a() && aVar.f55560c == d.UUID_CONFIRM.a()) {
                        str2 = aVar.f55559b;
                        if (str2 != null || str2.length() == 0) {
                            Log.e("MicroMsg.SDK.NoopingTask", "nooping fail, confirm with an empty code!!!");
                            oAuthErrCode = OAuthErrCode.WechatAuth_Err_NormalErr;
                            aVar.f55558a = oAuthErrCode;
                        }
                    }
                } else {
                    Log.e("MicroMsg.SDK.NoopingTask", String.format("nooping fail, errCode = %s, uuidStatusCode = %d", oAuthErrCode3.toString(), Integer.valueOf(aVar.f55560c)));
                }
                return aVar;
            }
            Log.e("MicroMsg.SDK.NoopingResult", "parse fail, buf is null");
            oAuthErrCode2 = OAuthErrCode.WechatAuth_Err_NetworkErr;
            aVar.f55558a = oAuthErrCode2;
            Log.d("MicroMsg.SDK.NoopingTask", String.format("nooping, url = %s, errCode = %s, uuidStatusCode = %d, time consumed = %d(ms)", string, aVar.f55558a.toString(), Integer.valueOf(aVar.f55560c), Long.valueOf(jCurrentTimeMillis2 - jCurrentTimeMillis)));
            oAuthErrCode3 = aVar.f55558a;
            if (oAuthErrCode3 == OAuthErrCode.WechatAuth_Err_OK) {
                i11 = aVar.f55560c;
                this.f55557d = i11;
                if (i11 == d.UUID_SCANED.a()) {
                    this.f55556c.onQrcodeScanned();
                } else if (aVar.f55560c == d.UUID_KEEP_CONNECT.a()) {
                    continue;
                } else {
                    str2 = aVar.f55559b;
                    if (str2 != null) {
                    }
                    Log.e("MicroMsg.SDK.NoopingTask", "nooping fail, confirm with an empty code!!!");
                    oAuthErrCode = OAuthErrCode.WechatAuth_Err_NormalErr;
                    aVar.f55558a = oAuthErrCode;
                }
            } else {
                Log.e("MicroMsg.SDK.NoopingTask", String.format("nooping fail, errCode = %s, uuidStatusCode = %d", oAuthErrCode3.toString(), Integer.valueOf(aVar.f55560c)));
            }
            return aVar;
        }
        Log.i("MicroMsg.SDK.NoopingTask", "IDiffDevOAuth.stopAuth / detach invoked");
        aVar = new a();
        oAuthErrCode = OAuthErrCode.WechatAuth_Err_Auth_Stopped;
        aVar.f55558a = oAuthErrCode;
        return aVar;
    }

    @Override // android.os.AsyncTask
    protected void onPostExecute(a aVar) {
        a aVar2 = aVar;
        this.f55556c.onAuthFinish(aVar2.f55558a, aVar2.f55559b);
    }
}
