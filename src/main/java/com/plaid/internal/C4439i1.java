package com.plaid.internal;

import android.util.Base64;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.plaid.internal.i1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4439i1 implements InterfaceC4421g1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C4572x0 f47726b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47727a;

    static {
        W3 w11 = Z3.f46846a;
        f47726b = new C4572x0("flowV1");
    }

    public C4439i1(String str) {
        this.f47727a = str;
    }

    @Override // com.plaid.internal.InterfaceC4421g1
    public final String a(InterfaceC4519r1 interfaceC4519r1, C4500p c4500p) throws C4509q {
        c4500p.f48003d = "v1";
        String str = this.f47727a;
        String str2 = (String) AbstractC4555v1.b(str).get("cid");
        if (str2 == null) {
            LinkedHashMap linkedHashMapB = AbstractC4555v1.b(str);
            String str3 = (String) linkedHashMapB.get("vfp");
            str2 = str3 == null ? (String) linkedHashMapB.get("token") : str3;
        }
        c4500p.f48004e = str2;
        LinkedHashMap linkedHashMapB2 = AbstractC4555v1.b(this.f47727a);
        String str4 = (String) linkedHashMapB2.get("vfp");
        if (str4 == null) {
            str4 = (String) linkedHashMapB2.get("token");
        }
        int i11 = 0;
        while (true) {
            try {
                C4500p.a aVar = new C4500p.a(str);
                c4500p.f48002c.add(aVar);
                InterfaceC4519r1.b bVarA = interfaceC4519r1.a(new InterfaceC4519r1.a(str, false, null, ((Number) c4500p.f48005f.a("connection-timeout", 10000, Number.class)).intValue()));
                int i12 = bVarA.f48083b;
                aVar.f48007b = i12;
                if (i12 >= 200 && i12 <= 202) {
                    if (c4500p.f48005f.a("forward-mno-response")) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put(PermissionsResponse.STATUS_KEY, bVarA.f48083b);
                            jSONObject.put("statusText", bVarA.f48084c);
                            jSONObject.put("headers", new JSONObject(bVarA.f48085d));
                            jSONObject.put("body", bVarA.f48082a);
                            return Base64.encodeToString(("mno-resp:" + jSONObject).getBytes(StandardCharsets.UTF_8), 10);
                        } catch (JSONException e11) {
                            throw new C4509q(T0.GENERIC_UNKNOWN_REASON, e11);
                        }
                    }
                    String str5 = bVarA.f48082a;
                    try {
                        String strA = a(new JSONObject(str5));
                        if (strA != null) {
                            return strA;
                        }
                        throw new C4509q(T0.AUTH_INVALID_RESPONSE, "Received unknown payload: " + str5);
                    } catch (JSONException e12) {
                        throw new C4509q(T0.AUTH_INVALID_RESPONSE, e12);
                    }
                }
                if (i12 < 300 || i12 >= 400) {
                    C4572x0 c4572x0 = f47726b;
                    c4572x0.a(W3.INFO, "error response code: %d %s", Integer.valueOf(i12), bVarA.f48084c);
                    c4572x0.a(W3.DEBUG, "error response body: %s", bVarA.f48082a);
                    if (i12 == 404) {
                        throw new C4509q(T0.AUTH_BAD_CREDENTIALS);
                    }
                    if (i12 == 410) {
                        throw new C4509q(T0.AUTH_VFP_KEY_EXPIRED);
                    }
                    throw new C4509q(T0.AUTH_INVALID_RESPONSE, "Unsupported response status=" + i12);
                }
                i11++;
                if (i11 > 10) {
                    throw new C4509q(T0.GENERIC_COMMUNICATION_ERROR, "too many redirects");
                }
                str = bVarA.f48085d.get("location");
                if (!c4500p.f48005f.a("skip-vfp-detection")) {
                    LinkedHashMap linkedHashMapB3 = AbstractC4555v1.b(str);
                    String str6 = (String) linkedHashMapB3.get("vfp");
                    String str7 = str6 == null ? (String) linkedHashMapB3.get("token") : str6;
                    if (str4 == null) {
                        str4 = str7;
                    } else if (str7 != null && !str7.equals(str4)) {
                        f47726b.a(W3.DEBUG, "jumping out of redirect loop with different vfp: %s", str7);
                        return str7;
                    }
                }
            } catch (IOException e13) {
                throw new C4509q(T0.GENERIC_COMMUNICATION_ERROR, e13);
            }
        }
    }

    public static String a(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("vfp");
        if (!strOptString.isEmpty()) {
            return strOptString;
        }
        String strOptString2 = jSONObject.optString("token");
        String strOptString3 = jSONObject.optString("correlation_id");
        if (!strOptString2.isEmpty()) {
            if (strOptString3.isEmpty()) {
                return strOptString2;
            }
            return strOptString3 + "..." + strOptString2;
        }
        String strOptString4 = jSONObject.optString("reconcilation_token");
        if (strOptString4.isEmpty()) {
            return null;
        }
        if (strOptString3.isEmpty()) {
            return strOptString4;
        }
        return strOptString3 + "..." + strOptString4;
    }
}
