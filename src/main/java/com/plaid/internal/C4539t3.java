package com.plaid.internal;

import com.adyen.checkout.components.core.Address;
import com.plaid.link.event.LinkEvent;
import com.plaid.link.event.LinkEventMetadata;
import com.plaid.link.result.LinkExit;
import com.plaid.link.result.LinkSuccess;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlinx.serialization.SerializationException;
import okhttp3.HttpUrl;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.plaid.internal.t3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4539t3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f48135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wo0.b f48136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f48137c;

    /* JADX INFO: renamed from: com.plaid.internal.t3$a */
    public interface a {
        void a(C4342a1 c4342a1);

        void a(LinkEvent linkEvent, I2 i11);

        void a(LinkExit linkExit);

        void a(LinkSuccess linkSuccess);

        void a(String str, LinkEventMetadata linkEventMetadata);

        void a(LinkedHashMap linkedHashMap);

        void b(String str);

        void c(String str);
    }

    /* JADX INFO: renamed from: com.plaid.internal.t3$b */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f48138a;

        static {
            int[] iArr = new int[EnumC4516q6.values().length];
            try {
                iArr[EnumC4516q6.ENQUEUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4516q6.ENQUEUE_AND_FLUSH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC4516q6.NO_ENQUEUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC4516q6.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f48138a = iArr;
        }
    }

    public C4539t3(a listener, wo0.b json) {
        p013kotlin.jvm.internal.s.k(listener, "listener");
        p013kotlin.jvm.internal.s.k(json, "json");
        this.f48135a = listener;
        this.f48136b = json;
    }

    public final void a(String url) {
        int i11;
        I2 aVar;
        p013kotlin.jvm.internal.s.k(url, "url");
        EnumC4516q6 enumC4516q6 = null;
        if (!p013kotlin.text.t.b0(url, "plaidlink://", false, 2, null)) {
            X5.a.a(X5.f46812a, "external link: " + url);
            this.f48135a.c(url);
            return;
        }
        HttpUrl httpUrl = HttpUrl.INSTANCE.get(p013kotlin.text.t.V(url, "plaidlink://", "https://", false, 4, null));
        X5.a.a(X5.f46812a, "plaidcallback " + url);
        String strHost = httpUrl.host();
        if (!p013kotlin.jvm.internal.s.f(strHost, "event")) {
            A6.a.b(p013kotlin.collections.v0.i(), "Webview url intercepted: " + strHost);
        }
        Set<String> setQueryParameterNames = httpUrl.queryParameterNames();
        LinkedHashMap linkData = new LinkedHashMap(bo0.n.f(p013kotlin.collections.v0.e(p013kotlin.collections.v.y(setQueryParameterNames, 10)), 16));
        for (Object obj : setQueryParameterNames) {
            String strQueryParameter = httpUrl.queryParameter((String) obj);
            if (strQueryParameter == null) {
                strQueryParameter = "";
            }
            linkData.put(obj, strQueryParameter);
        }
        String str = (String) linkData.get("link_session_id");
        if (str != null) {
            if (str.length() <= 0) {
                str = null;
            }
            if (str != null && !p013kotlin.jvm.internal.s.f(str, this.f48137c)) {
                this.f48135a.b(str);
                this.f48137c = str;
            }
        }
        int iHashCode = strHost.hashCode();
        if (iHashCode != -579210487) {
            if (iHashCode != 3127582) {
                if (iHashCode != 96891546) {
                    if (iHashCode == 2091030007 && strHost.equals("session_handoff")) {
                        X5.a.a(X5.f46812a, "Handoff to out of process");
                        this.f48135a.a(linkData);
                        return;
                    }
                } else if (strHost.equals("event")) {
                    String str2 = (String) linkData.get("event_name");
                    String str3 = Address.ADDRESS_NULL_PLACEHOLDER;
                    if (str2 == null) {
                        str2 = Address.ADDRESS_NULL_PLACEHOLDER;
                    }
                    String str4 = (String) linkData.get("queue_behavior");
                    if (str4 == null) {
                        str4 = Address.ADDRESS_NULL_PLACEHOLDER;
                    }
                    String str5 = (String) linkData.get("delay_ms");
                    if (str5 != null) {
                        str3 = str5;
                    }
                    X5.a aVar2 = X5.f46812a;
                    aVar2.getClass();
                    X5.a.a("Event name: " + str2, false);
                    X5.a.a(aVar2, "queue_behavior: " + str4 + ", delay_ms: " + str3);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Received event: ");
                    sb2.append(str2);
                    A6.a.b(p013kotlin.collections.v0.m(jn0.x.a("event_name", str2), jn0.x.a("queue_behavior", str4), jn0.x.a("delay_ms", str3)), sb2.toString());
                    X5.a.a(aVar2, httpUrl.getUrl());
                    String str6 = (String) linkData.get("delay_ms");
                    if (str6 != null) {
                        try {
                            i11 = Integer.parseInt(str6);
                        } catch (NumberFormatException unused) {
                            i11 = 0;
                        }
                    } else {
                        i11 = 0;
                    }
                    for (EnumC4516q6 enumC4516q7 : EnumC4516q6.values()) {
                        if (p013kotlin.jvm.internal.s.f(enumC4516q7.getProtoString(), str4)) {
                            enumC4516q6 = enumC4516q7;
                            break;
                        }
                    }
                    if (enumC4516q6 == null) {
                        enumC4516q6 = EnumC4516q6.UNKNOWN;
                    }
                    int i12 = b.f48138a[enumC4516q6.ordinal()];
                    if (i12 == 1) {
                        aVar = I2.b.f46347a;
                    } else if (i12 == 2) {
                        aVar = I2.c.f46348a;
                    } else if (i12 == 3) {
                        aVar = I2.d.f46349a;
                    } else {
                        if (i12 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        aVar = i11 > 0 ? new I2.a(i11) : I2.d.f46349a;
                    }
                    try {
                        a aVar3 = this.f48135a;
                        p013kotlin.jvm.internal.s.k(linkData, "linkData");
                        aVar3.a(LinkEvent.INSTANCE.fromMap$link_sdk_release(linkData), aVar);
                        return;
                    } catch (NoSuchElementException unused2) {
                        this.f48135a.a(new C4342a1("Failed to parse event"));
                        return;
                    }
                }
            } else if (strHost.equals("exit")) {
                X5.a aVar4 = X5.f46812a;
                X5.a.a(aVar4, "User status in flow: ", new Object[]{"data: " + linkData.get(PermissionsResponse.STATUS_KEY)});
                X5.a.a(aVar4, "Link request ID: ", new Object[]{"data: " + linkData.get("request_id")});
                try {
                    a aVar5 = this.f48135a;
                    p013kotlin.jvm.internal.s.k(linkData, "linkData");
                    aVar5.a(LinkExit.INSTANCE.fromMap$link_sdk_release(linkData));
                    return;
                } catch (NoSuchElementException unused3) {
                    this.f48135a.a(new C4342a1("Failed to parse exit"));
                    return;
                }
            }
        } else if (strHost.equals("connected")) {
            X5.a aVar6 = X5.f46812a;
            X5.a.a(aVar6, "Institution id: " + linkData.get("institution_id"));
            X5.a.a(aVar6, "Institution name:  " + linkData.get("institution_name"));
            a(linkData);
            return;
        }
        X5.a.a(X5.f46812a, "Link action detected: " + strHost);
        this.f48135a.a(strHost, LinkEventMetadata.INSTANCE.fromMap(linkData, this.f48137c));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.ArrayList] */
    public final void a(LinkedHashMap linkedHashMap) {
        List list;
        ?? M;
        String str = (String) linkedHashMap.get("accounts");
        if (str == null) {
            str = "";
        }
        try {
            try {
                wo0.b bVar = this.f48136b;
                D1.f46261g.getClass();
                D1.b.a();
                list = (List) bVar.d(so0.a.g(D1.a.f46268a), str);
            } catch (SerializationException unused) {
                X5.a.b(X5.f46812a, "Unable to parse accounts data: " + P4.a(str));
                list = null;
            }
            if (list != null) {
                M = new ArrayList(p013kotlin.collections.v.y(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    M.add(L2.a((D1) it.next()));
                }
            } else {
                M = p013kotlin.collections.v.m();
            }
            this.f48135a.a(L2.a(linkedHashMap, (List) M));
        } catch (NoSuchElementException unused2) {
            this.f48135a.a(new C4342a1("Failed to parse success"));
        }
    }
}
