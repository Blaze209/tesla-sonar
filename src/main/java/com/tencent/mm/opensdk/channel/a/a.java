package com.tencent.mm.opensdk.channel.a;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.tencent.mm.opensdk.constants.Build;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.tencent.mm.opensdk.utils.Log;
import com.tencent.mm.opensdk.utils.b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: com.tencent.mm.opensdk.channel.a.a$a, reason: collision with other inner class name */
    public static class C1122a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f55531a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f55532b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f55533c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f55534d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Bundle f55535e;
    }

    public static int a(Bundle bundle, String str, int i11) {
        if (bundle == null) {
            return i11;
        }
        try {
            return bundle.getInt(str, i11);
        } catch (Exception e11) {
            Log.e("MicroMsg.IntentUtil", "getIntExtra exception:" + e11.getMessage());
            return i11;
        }
    }

    public static Object a(int i11, String str) {
        try {
            switch (i11) {
                case 1:
                    return Integer.valueOf(str);
                case 2:
                    return Long.valueOf(str);
                case 3:
                    return str;
                case 4:
                    return Boolean.valueOf(str);
                case 5:
                    return Float.valueOf(str);
                case 6:
                    return Double.valueOf(str);
                default:
                    Log.e("MicroMsg.SDK.PluginProvider.Resolver", "unknown type");
                    return null;
            }
        } catch (Exception e11) {
            Log.e("MicroMsg.SDK.PluginProvider.Resolver", "resolveObj exception:" + e11.getMessage());
            return null;
        }
    }

    public static String a(Bundle bundle, String str) {
        if (bundle == null) {
            return null;
        }
        try {
            return bundle.getString(str);
        } catch (Exception e11) {
            Log.e("MicroMsg.IntentUtil", "getStringExtra exception:" + e11.getMessage());
            return null;
        }
    }

    public static boolean a(Context context, C1122a c1122a) {
        String str;
        String str2;
        if (context == null || c1122a == null) {
            str = "send fail, invalid argument";
        } else {
            if (!b.b(c1122a.f55532b)) {
                if (b.b(c1122a.f55531a)) {
                    str2 = null;
                } else {
                    str2 = c1122a.f55531a + ".permission.MM_MESSAGE";
                }
                Intent intent = new Intent(c1122a.f55532b);
                Bundle bundle = c1122a.f55535e;
                if (bundle != null) {
                    intent.putExtras(bundle);
                }
                String packageName = context.getPackageName();
                intent.putExtra(ConstantsAPI.SDK_VERSION, Build.SDK_INT);
                intent.putExtra(ConstantsAPI.APP_PACKAGE, packageName);
                intent.putExtra(ConstantsAPI.CONTENT, c1122a.f55533c);
                intent.putExtra(ConstantsAPI.APP_SUPORT_CONTENT_TYPE, c1122a.f55534d);
                intent.putExtra(ConstantsAPI.CHECK_SUM, a(c1122a.f55533c, Build.SDK_INT, packageName));
                context.sendBroadcast(intent, str2);
                Log.d("MicroMsg.SDK.MMessage", "send mm message, intent=" + intent + ", perm=" + str2);
                return true;
            }
            str = "send fail, action is null";
        }
        Log.e("MicroMsg.SDK.MMessage", str);
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:167:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:168:0x01dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x02de A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x02a4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:0x01a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x016b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x01fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x02c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x0188 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x0217 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x01c2: MOVE (r1 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:114:0x01c2 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r8v35, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r8v45, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r8v58, types: [java.net.HttpURLConnection, java.net.URLConnection] */
    /* JADX WARN: Type inference failed for: r8v59 */
    /* JADX WARN: Type inference failed for: r8v60 */
    /* JADX WARN: Type inference failed for: r8v61 */
    /* JADX WARN: Type inference failed for: r8v62 */
    /* JADX WARN: Type inference failed for: r8v72, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r8v73, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r8v76, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r8v77 */
    /* JADX WARN: Type inference failed for: r8v78 */
    /* JADX WARN: Type inference failed for: r8v79 */
    /* JADX WARN: Type inference failed for: r8v80 */
    /* JADX WARN: Type inference failed for: r8v81 */
    /* JADX WARN: Type inference failed for: r8v82 */
    /* JADX WARN: Type inference failed for: r8v83 */
    /* JADX WARN: Type inference failed for: r8v84 */
    /* JADX WARN: Type inference failed for: r8v85 */
    /* JADX WARN: Type inference failed for: r8v86 */
    /* JADX WARN: Type inference failed for: r8v87 */
    /* JADX WARN: Type inference failed for: r8v88 */
    /* JADX WARN: Type inference failed for: r8v89 */
    /* JADX WARN: Type inference failed for: r8v90 */
    /* JADX WARN: Type inference failed for: r8v91 */
    /* JADX WARN: Type inference failed for: r8v92 */
    /* JADX WARN: Type inference failed for: r8v93 */
    /* JADX WARN: Type inference failed for: r8v94 */
    /* JADX WARN: Type inference failed for: r8v95 */
    /* JADX WARN: Type inference failed for: r8v96 */
    /* JADX WARN: Type inference failed for: r8v97 */
    public static byte[] a(String str, int i11) throws Throwable {
        String string;
        ByteArrayOutputStream byteArrayOutputStream;
        ?? r11;
        ByteArrayOutputStream byteArrayOutputStream2;
        ?? r12;
        ?? r13;
        Exception e11;
        ?? r14;
        InputStream inputStream;
        IOException e12;
        ?? r15;
        InputStream inputStream2;
        MalformedURLException e13;
        ?? r16;
        InputStream inputStream3;
        ByteArrayOutputStream byteArrayOutputStream3;
        ByteArrayOutputStream byteArrayOutputStream4;
        ByteArrayOutputStream byteArrayOutputStream5;
        ?? r17;
        ?? r18;
        ?? r19;
        StringBuilder sb2;
        ByteArrayOutputStream byteArrayOutputStream6 = null;
        byteArrayOutputStream6 = null;
        byteArrayOutputStream6 = null;
        ?? r21 = 0;
        if (str != null) {
            int length = str.length();
            try {
                if (length == 0) {
                    string = "httpGet, url is null";
                } else {
                    try {
                        ?? th2 = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
                        try {
                            if (th2 != 0) {
                                try {
                                    th2.setRequestMethod("GET");
                                    th2.setConnectTimeout(i11);
                                    th2.setReadTimeout(i11);
                                    if (th2.getResponseCode() >= 300) {
                                        Log.e("MicroMsg.SDK.NetUtil", "httpURLConnectionGet 300");
                                        try {
                                            th2.disconnect();
                                            return null;
                                        } catch (Throwable th3) {
                                            th2 = th3;
                                            sb2 = new StringBuilder();
                                        }
                                    } else {
                                        InputStream inputStream4 = th2.getInputStream();
                                        try {
                                            ByteArrayOutputStream byteArrayOutputStream7 = new ByteArrayOutputStream();
                                            try {
                                                byte[] bArr = new byte[1024];
                                                while (true) {
                                                    int i12 = inputStream4.read(bArr);
                                                    if (i12 == -1) {
                                                        break;
                                                    }
                                                    byteArrayOutputStream7.write(bArr, 0, i12);
                                                }
                                                byte[] byteArray = byteArrayOutputStream7.toByteArray();
                                                Log.d("MicroMsg.SDK.NetUtil", "httpGet end");
                                                try {
                                                    th2.disconnect();
                                                } catch (Throwable th4) {
                                                    Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th4.getMessage());
                                                }
                                                try {
                                                    inputStream4.close();
                                                } catch (Throwable th5) {
                                                    Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th5.getMessage());
                                                }
                                                try {
                                                    byteArrayOutputStream7.close();
                                                } catch (Throwable th6) {
                                                    Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th6.getMessage());
                                                }
                                                return byteArray;
                                            } catch (MalformedURLException e14) {
                                                inputStream3 = inputStream4;
                                                e13 = e14;
                                                byteArrayOutputStream5 = byteArrayOutputStream7;
                                                r19 = th2;
                                            } catch (IOException e15) {
                                                inputStream2 = inputStream4;
                                                e12 = e15;
                                                byteArrayOutputStream4 = byteArrayOutputStream7;
                                                r18 = th2;
                                                Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + e12.getMessage());
                                                if (r18 != 0) {
                                                    try {
                                                        r18.disconnect();
                                                    } catch (Throwable th7) {
                                                        Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th7.getMessage());
                                                    }
                                                }
                                                if (inputStream2 != null) {
                                                    try {
                                                        inputStream2.close();
                                                    } catch (Throwable th8) {
                                                        Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th8.getMessage());
                                                    }
                                                }
                                                if (byteArrayOutputStream4 != null) {
                                                    try {
                                                        byteArrayOutputStream4.close();
                                                    } catch (Throwable th9) {
                                                        Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th9.getMessage());
                                                    }
                                                }
                                                return null;
                                            } catch (Exception e16) {
                                                inputStream = inputStream4;
                                                e11 = e16;
                                                byteArrayOutputStream3 = byteArrayOutputStream7;
                                                r17 = th2;
                                                Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + e11.getMessage());
                                                if (r17 != 0) {
                                                    try {
                                                        r17.disconnect();
                                                    } catch (Throwable th10) {
                                                        Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th10.getMessage());
                                                    }
                                                }
                                                if (inputStream != null) {
                                                    try {
                                                        inputStream.close();
                                                    } catch (Throwable th11) {
                                                        Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th11.getMessage());
                                                    }
                                                }
                                                if (byteArrayOutputStream3 != null) {
                                                    try {
                                                        byteArrayOutputStream3.close();
                                                    } catch (Throwable th12) {
                                                        Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th12.getMessage());
                                                    }
                                                }
                                                return null;
                                            } catch (Throwable th13) {
                                                r13 = inputStream4;
                                                th = th13;
                                                byteArrayOutputStream6 = byteArrayOutputStream7;
                                                r12 = th2;
                                                ?? r22 = r13;
                                                byteArrayOutputStream2 = byteArrayOutputStream6;
                                                r21 = r22;
                                                r11 = r12;
                                                if (r11 != 0) {
                                                    try {
                                                        r11.disconnect();
                                                    } catch (Throwable th14) {
                                                        Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th14.getMessage());
                                                    }
                                                }
                                                if (r21 != 0) {
                                                    try {
                                                        r21.close();
                                                    } catch (Throwable th15) {
                                                        Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th15.getMessage());
                                                    }
                                                }
                                                if (byteArrayOutputStream2 != null) {
                                                    throw th;
                                                }
                                                try {
                                                    byteArrayOutputStream2.close();
                                                    throw th;
                                                } catch (Throwable th16) {
                                                    Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th16.getMessage());
                                                    throw th;
                                                }
                                            }
                                        } catch (MalformedURLException e17) {
                                            inputStream3 = inputStream4;
                                            e13 = e17;
                                            r16 = th2;
                                            byteArrayOutputStream5 = null;
                                            r19 = r16;
                                        } catch (IOException e18) {
                                            inputStream2 = inputStream4;
                                            e12 = e18;
                                            r15 = th2;
                                            byteArrayOutputStream4 = null;
                                            r18 = r15;
                                            Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + e12.getMessage());
                                            if (r18 != 0) {
                                                r18.disconnect();
                                            }
                                            if (inputStream2 != null) {
                                                inputStream2.close();
                                            }
                                            if (byteArrayOutputStream4 != null) {
                                                byteArrayOutputStream4.close();
                                            }
                                            return null;
                                        } catch (Exception e19) {
                                            inputStream = inputStream4;
                                            e11 = e19;
                                            r14 = th2;
                                            byteArrayOutputStream3 = null;
                                            r17 = r14;
                                            Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + e11.getMessage());
                                            if (r17 != 0) {
                                                r17.disconnect();
                                            }
                                            if (inputStream != null) {
                                                inputStream.close();
                                            }
                                            if (byteArrayOutputStream3 != null) {
                                                byteArrayOutputStream3.close();
                                            }
                                            return null;
                                        } catch (Throwable th17) {
                                            r13 = inputStream4;
                                            th = th17;
                                            r12 = th2;
                                        }
                                    }
                                } catch (MalformedURLException e21) {
                                    e13 = e21;
                                    inputStream3 = null;
                                    r16 = th2;
                                } catch (IOException e22) {
                                    e12 = e22;
                                    inputStream2 = null;
                                    r15 = th2;
                                } catch (Exception e23) {
                                    e11 = e23;
                                    inputStream = null;
                                    r14 = th2;
                                } catch (Throwable th18) {
                                    th = th18;
                                    r13 = 0;
                                    r12 = th2;
                                }
                                byteArrayOutputStream5 = null;
                                r19 = r16;
                                Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + e13.getMessage());
                                if (r19 != 0) {
                                    try {
                                        r19.disconnect();
                                    } catch (Throwable th19) {
                                        Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th19.getMessage());
                                    }
                                }
                                if (inputStream3 != null) {
                                    try {
                                        inputStream3.close();
                                    } catch (Throwable th20) {
                                        Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th20.getMessage());
                                    }
                                }
                                if (byteArrayOutputStream5 != null) {
                                    try {
                                        byteArrayOutputStream5.close();
                                    } catch (Throwable th21) {
                                        Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th21.getMessage());
                                    }
                                }
                                return null;
                            }
                            Log.e("MicroMsg.SDK.NetUtil", "open connection failed.");
                            if (th2 != 0) {
                                try {
                                    th2.disconnect();
                                    return null;
                                } catch (Throwable th22) {
                                    th2 = th22;
                                    sb2 = new StringBuilder();
                                }
                            }
                            sb2.append("httpGet ex:");
                            sb2.append(th2.getMessage());
                            string = sb2.toString();
                        } catch (MalformedURLException e24) {
                            e13 = e24;
                            inputStream3 = null;
                            byteArrayOutputStream5 = null;
                            r19 = th2;
                        } catch (IOException e25) {
                            e12 = e25;
                            inputStream2 = null;
                            byteArrayOutputStream4 = null;
                            r18 = th2;
                        } catch (Exception e26) {
                            e11 = e26;
                            inputStream = null;
                            byteArrayOutputStream3 = null;
                            r17 = th2;
                        } catch (Throwable th23) {
                            th = th23;
                            byteArrayOutputStream2 = null;
                            r11 = th2;
                            if (r11 != 0) {
                                r11.disconnect();
                            }
                            if (r21 != 0) {
                                r21.close();
                            }
                            if (byteArrayOutputStream2 != null) {
                                throw th;
                            }
                            byteArrayOutputStream2.close();
                            throw th;
                        }
                    } catch (MalformedURLException e27) {
                        e13 = e27;
                        r16 = 0;
                        inputStream3 = null;
                    } catch (IOException e28) {
                        e12 = e28;
                        r15 = 0;
                        inputStream2 = null;
                    } catch (Exception e29) {
                        e11 = e29;
                        r14 = 0;
                        inputStream = null;
                    } catch (Throwable th24) {
                        th = th24;
                        r12 = 0;
                        r13 = 0;
                    }
                }
                Log.e("MicroMsg.SDK.NetUtil", string);
            } catch (Throwable th25) {
                th = th25;
                byteArrayOutputStream6 = byteArrayOutputStream;
                r13 = length;
                r12 = str;
            }
        } else {
            string = "httpGet, url is null";
            Log.e("MicroMsg.SDK.NetUtil", string);
        }
        return null;
    }

    public static byte[] a(String str, int i11, String str2) {
        String str3;
        StringBuffer stringBuffer = new StringBuffer();
        if (str != null) {
            stringBuffer.append(str);
        }
        stringBuffer.append(i11);
        stringBuffer.append(str2);
        stringBuffer.append("mMcShCsTr");
        byte[] bytes = stringBuffer.toString().substring(1, 9).getBytes();
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bytes);
            byte[] bArrDigest = messageDigest.digest();
            char[] cArr2 = new char[bArrDigest.length * 2];
            int i12 = 0;
            for (byte b11 : bArrDigest) {
                int i13 = i12 + 1;
                cArr2[i12] = cArr[(b11 >>> 4) & 15];
                i12 += 2;
                cArr2[i13] = cArr[b11 & 15];
            }
            str3 = new String(cArr2);
        } catch (Exception unused) {
            str3 = null;
        }
        return str3.getBytes();
    }
}
