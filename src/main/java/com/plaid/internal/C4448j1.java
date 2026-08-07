package com.plaid.internal;

import android.util.Base64;
import com.google.android.gms.common.internal.ImagesContract;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.plaid.internal.j1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4448j1 implements InterfaceC4421g1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C4572x0 f47759e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JSONObject f47762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JSONObject f47763d;

    static {
        W3 w11 = Z3.f46846a;
        f47759e = new C4572x0("flowV2");
    }

    public C4448j1(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2) {
        this.f47760a = str;
        this.f47761b = str2;
        this.f47762c = jSONObject;
        this.f47763d = jSONObject2;
    }

    public static C4448j1 a(String str) throws C4509q {
        String str2 = (String) AbstractC4555v1.b(str).get("data");
        if (str2 == null) {
            throw new C4509q(T0.AUTH_MALFORMED_INPUT_DATA, "Invalid flow.v2 data - missing in url");
        }
        try {
            String str3 = new String(Base64.decode(str2, 8));
            f47759e.a(W3.TRACE, "decoded data: %s", str3);
            JSONObject jSONObject = new JSONObject(str3);
            try {
                String string = jSONObject.getString(ImagesContract.URL);
                try {
                    String string2 = jSONObject.getString("vfp");
                    try {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                        try {
                            new URL(string);
                            return new C4448j1(string, string2, jSONObject2, jSONObject.optJSONObject("att-1004"));
                        } catch (MalformedURLException unused) {
                            throw new C4509q(T0.AUTH_MALFORMED_INPUT_DATA, "Malformed url " + string);
                        }
                    } catch (JSONException unused2) {
                        throw new C4509q(T0.AUTH_MALFORMED_INPUT_DATA, "Invalid flow.v2 data - missing data field");
                    }
                } catch (JSONException unused3) {
                    throw new C4509q(T0.AUTH_MALFORMED_INPUT_DATA, "Invalid flow.v2 data - missing vfp field");
                }
            } catch (JSONException unused4) {
                throw new C4509q(T0.AUTH_MALFORMED_INPUT_DATA, "Invalid flow.v2 data - missing url field");
            }
        } catch (Exception unused5) {
            throw new C4509q(T0.AUTH_MALFORMED_INPUT_DATA, "Invalid flow.v2 data - cannot parse as json");
        }
    }

    @Override // com.plaid.internal.InterfaceC4421g1
    public final String a(InterfaceC4519r1 interfaceC4519r1, C4500p c4500p) throws C4509q {
        String str;
        c4500p.f48003d = "v2";
        String str2 = this.f47760a;
        String str3 = (String) AbstractC4555v1.b(str2).get("cid");
        if (str3 == null) {
            LinkedHashMap linkedHashMapB = AbstractC4555v1.b(str2);
            str3 = (String) linkedHashMapB.get("vfp");
            if (str3 == null) {
                str3 = (String) linkedHashMapB.get("token");
            }
        }
        c4500p.f48004e = str3;
        JSONObject jSONObject = this.f47762c;
        boolean z11 = false;
        while (true) {
            C4500p.a aVar = new C4500p.a(this.f47760a);
            c4500p.f48002c.add(aVar);
            try {
                String string = jSONObject.toString();
                C4572x0 c4572x0 = f47759e;
                W3 w11 = W3.TRACE;
                c4572x0.a(w11, "att request body: %s", string);
                InterfaceC4519r1.b bVarA = interfaceC4519r1.a(new InterfaceC4519r1.a(this.f47760a, true, string, ((Number) c4500p.f48005f.a("connection-timeout-att", 10000, Number.class)).intValue()));
                int i11 = bVarA.f48083b;
                aVar.f48007b = i11;
                if (i11 >= 200 && i11 <= 202) {
                    str = bVarA.f48082a;
                    c4572x0.a(w11, "att response body: %s", str);
                    if (z11) {
                        break;
                    }
                    try {
                        if (new JSONObject(str).optInt(PermissionsResponse.STATUS_KEY, -1) != 1004) {
                            break;
                        }
                        JSONObject jSONObject2 = this.f47763d;
                        String strOptString = jSONObject2 == null ? null : jSONObject2.optString("application-id");
                        if (strOptString == null) {
                            c4572x0.a(W3.DEBUG, "missing att1004.application-id, continue flow v2", new Object[0]);
                            break;
                        }
                        c4572x0.a(W3.DEBUG, "flow v2.5 detected, use application-id: %s", strOptString);
                        try {
                            JSONObject jSONObject3 = new JSONObject(jSONObject.toString());
                            try {
                                jSONObject3.putOpt("application-id", strOptString);
                                jSONObject = jSONObject3;
                                z11 = true;
                            } catch (JSONException e11) {
                                throw new IllegalStateException(e11);
                            }
                        } catch (JSONException e12) {
                            throw new IllegalStateException(e12);
                        }
                    } catch (JSONException unused) {
                    }
                } else {
                    if (i11 >= 300 && i11 < 400) {
                        throw new C4509q(T0.AUTH_INVALID_RESPONSE, "Unexpected redirect in flow v2");
                    }
                    c4572x0.a(W3.INFO, "error response code: %i %s", Integer.valueOf(i11), bVarA.f48084c);
                    c4572x0.a(W3.DEBUG, "error response body: %s", bVarA.f48082a);
                    if (i11 == 404) {
                        throw new C4509q(T0.AUTH_BAD_CREDENTIALS);
                    }
                    if (i11 != 410) {
                        throw new C4509q(T0.AUTH_INVALID_RESPONSE, "Unsupported response status=" + i11);
                    }
                    throw new C4509q(T0.AUTH_VFP_KEY_EXPIRED);
                }
            } catch (IOException e13) {
                throw new C4509q(T0.GENERIC_COMMUNICATION_ERROR, e13);
            }
        }
        String strEncodeToString = Base64.encodeToString(str.getBytes(), 10);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f47761b);
        sb2.append("___");
        sb2.append(strEncodeToString);
        sb2.append(z11 ? "___R2" : "");
        return sb2.toString();
    }
}
