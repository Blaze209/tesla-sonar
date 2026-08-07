package com.plaid.internal;

import com.plaid.link.result.LinkExit;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlinx.serialization.SerializationException;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class S0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Q0.a f46679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wo0.b f46680b;

    public S0(Q0.a listener, wo0.b json) {
        p013kotlin.jvm.internal.s.k(listener, "listener");
        p013kotlin.jvm.internal.s.k(json, "json");
        this.f46679a = listener;
        this.f46680b = json;
    }

    public final boolean a(String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("start_link")) {
                if (!jSONObject.has("open_url")) {
                    return false;
                }
                String string = jSONObject.getString("open_url");
                Q0.a aVar = this.f46679a;
                p013kotlin.jvm.internal.s.h(string);
                aVar.a(string);
                return true;
            }
            String string2 = jSONObject.getJSONObject("start_link").toString();
            p013kotlin.jvm.internal.s.j(string2, "toString(...)");
            try {
                wo0.b bVar = this.f46680b;
                N0.b.a();
                M0 m0A = ((N0) bVar.d(N0.a.f46467a, string2)).a();
                X5.a.a(X5.f46812a, "embeddedLinkSessionInfo: " + m0A);
                this.f46679a.a(m0A);
                return true;
            } catch (SerializationException e11) {
                X5.a.b(X5.f46812a, "Unable to parse start_link message: " + string2 + " " + e11.getMessage());
                return false;
            }
        } catch (JSONException e12) {
            X5.a.b(X5.f46812a, "Unable to parse internal event: " + str + ", error: " + e12.getMessage());
            return false;
        }
    }

    public final void b(String url) {
        p013kotlin.jvm.internal.s.k(url, "url");
        HttpUrl httpUrl = HttpUrl.INSTANCE.get(p013kotlin.text.t.V(url, "plaidlink://", "https://", false, 4, null));
        String strHost = httpUrl.host();
        Set<String> setQueryParameterNames = httpUrl.queryParameterNames();
        LinkedHashMap linkedHashMap = new LinkedHashMap(bo0.n.f(p013kotlin.collections.v0.e(p013kotlin.collections.v.y(setQueryParameterNames, 10)), 16));
        Iterator<T> it = setQueryParameterNames.iterator();
        while (true) {
            String str = "";
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String strQueryParameter = httpUrl.queryParameter((String) next);
            if (strQueryParameter != null) {
                str = strQueryParameter;
            }
            linkedHashMap.put(next, str);
        }
        String str2 = (String) linkedHashMap.get("event");
        if (p013kotlin.jvm.internal.s.f(strHost, "internal-event") && str2 != null) {
            if (a(str2)) {
                return;
            }
            X5.a.b(X5.f46812a, "failed to handle internal event: " + str2);
            return;
        }
        if (!p013kotlin.jvm.internal.s.f(strHost, "exit")) {
            X5.a.b(X5.f46812a, "unknown action: " + strHost + ", parsedUri: " + httpUrl);
            return;
        }
        Set<String> setQueryParameterNames2 = httpUrl.queryParameterNames();
        LinkedHashMap linkData = new LinkedHashMap(bo0.n.f(p013kotlin.collections.v0.e(p013kotlin.collections.v.y(setQueryParameterNames2, 10)), 16));
        for (Object obj : setQueryParameterNames2) {
            String strQueryParameter2 = httpUrl.queryParameter((String) obj);
            if (strQueryParameter2 == null) {
                strQueryParameter2 = "";
            }
            linkData.put(obj, strQueryParameter2);
        }
        try {
            Q0.a aVar = this.f46679a;
            p013kotlin.jvm.internal.s.k(linkData, "linkData");
            aVar.a(LinkExit.INSTANCE.fromMap$link_sdk_release(linkData));
        } catch (NoSuchElementException unused) {
            this.f46679a.a(L2.b(new C4342a1("Failed to parse exit"), null));
        }
    }
}
