package com.plaid.internal;

import android.os.Bundle;
import com.google.protobuf.Timestamp;
import com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent;
import com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest;
import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class I6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d8 f46354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f46355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final I f46356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CoroutineDispatcher f46357d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile String f46358e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile String f46359f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile String f46360g;

    public I6(d8 workflowApi, String persistentLinkId, I clientTypeProvider) {
        p013kotlin.jvm.internal.s.k(workflowApi, "workflowApi");
        p013kotlin.jvm.internal.s.k(persistentLinkId, "persistentLinkId");
        p013kotlin.jvm.internal.s.k(clientTypeProvider, "clientTypeProvider");
        this.f46354a = workflowApi;
        this.f46355b = persistentLinkId;
        this.f46356c = clientTypeProvider;
        this.f46357d = Dispatchers.getIO().limitedParallelism(1);
    }

    public static final Workflow$LinkWorkflowEventRequest a(I6 i11, ArrayList arrayList, String str) {
        Mobile$MobileSDKPloggerLog.MobileSDKSession.b bVar;
        Mobile$MobileSDKPloggerLog.b bVar2;
        i11.getClass();
        Mobile$MobileSDKPloggerLog.MobileSDKSession.a aVarNewBuilder = Mobile$MobileSDKPloggerLog.MobileSDKSession.newBuilder();
        String str2 = i11.f46359f;
        if (str2 != null) {
            aVarNewBuilder.a(str2);
        }
        aVarNewBuilder.b(i11.f46355b);
        aVarNewBuilder.c(str);
        String str3 = i11.f46360g;
        if (str3 != null) {
            aVarNewBuilder.d(str3);
        }
        I i12 = i11.f46356c;
        I5 i13 = i12.f46343a;
        Bundle bundle = i13.f46353a.getPackageManager().getApplicationInfo(i13.f46353a.getPackageName(), 128).metaData;
        String string = bundle != null ? bundle.getString("com.github.jorgefspereira.plaid_flutter.version") : null;
        I5 i14 = i12.f46343a;
        Bundle bundle2 = i14.f46353a.getPackageManager().getApplicationInfo(i14.f46353a.getPackageName(), 128).metaData;
        String string2 = bundle2 != null ? bundle2.getString("com.plaid.link.react_native") : null;
        if (string == null || p013kotlin.text.t.y0(string)) {
            bVar = (string2 == null || p013kotlin.text.t.y0(string2)) ? Mobile$MobileSDKPloggerLog.MobileSDKSession.b.CLIENT_TYPE_ANDROID : Mobile$MobileSDKPloggerLog.MobileSDKSession.b.CLIENT_TYPE_REACTNATIVEANDROID;
        } else {
            bVar = Mobile$MobileSDKPloggerLog.MobileSDKSession.b.CLIENT_TYPE_FLUTTERANDROID;
        }
        aVarNewBuilder.a(bVar);
        Mobile$MobileSDKPloggerLog.MobileSDKSession mobileSDKSessionBuild = aVarNewBuilder.build();
        ArrayList arrayList2 = new ArrayList(p013kotlin.collections.v.y(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            D6 d11 = (D6) it.next();
            Mobile$MobileSDKPloggerLog.a aVarNewBuilder2 = Mobile$MobileSDKPloggerLog.newBuilder();
            E6 e11 = d11.f46275d;
            p013kotlin.jvm.internal.s.k(e11, "<this>");
            int i15 = F6.f46318a[e11.ordinal()];
            if (i15 == 1) {
                bVar2 = Mobile$MobileSDKPloggerLog.b.MOBILE_SDK_LOG_LEVEL_DEBUG;
            } else if (i15 == 2) {
                bVar2 = Mobile$MobileSDKPloggerLog.b.MOBILE_SDK_LOG_LEVEL_INFO;
            } else if (i15 == 3) {
                bVar2 = Mobile$MobileSDKPloggerLog.b.MOBILE_SDK_LOG_LEVEL_WARN;
            } else {
                if (i15 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar2 = Mobile$MobileSDKPloggerLog.b.MOBILE_SDK_LOG_LEVEL_ERROR;
            }
            long j11 = 1000;
            arrayList2.add(ClientEventOuterClass$ClientEvent.newBuilder().a(Timestamp.newBuilder().setSeconds(d11.f46273b / j11).setNanos((int) ((d11.f46273b % j11) * ((long) 1000000)))).a(str).a(aVarNewBuilder2.a(bVar2).a(d11.f46272a).a(d11.f46274c).a(mobileSDKSessionBuild).build()).build());
        }
        Workflow$LinkWorkflowEventRequest workflow$LinkWorkflowEventRequestBuild = Workflow$LinkWorkflowEventRequest.newBuilder().b(str).a(arrayList2).build();
        p013kotlin.jvm.internal.s.j(workflow$LinkWorkflowEventRequestBuild, "build(...)");
        return workflow$LinkWorkflowEventRequestBuild;
    }

    public final void a(String str) {
        if (this.f46358e != null && !p013kotlin.jvm.internal.s.f(this.f46358e, str)) {
            X5.a.e(X5.f46812a, "RemoteLogSender: Link session ID is being changed from " + this.f46358e + " to " + str);
        }
        this.f46358e = str;
        X5.a.a(X5.f46812a, "RemoteLogSender: link_session_id set: " + str);
    }

    public final void a(String str, String str2) {
        this.f46359f = str;
        this.f46360g = str2;
        X5.a.a(X5.f46812a, "RemoteLogSender: session data set: linkOpenId=" + str + ", linkToken=" + str2);
    }

    public final Object a(ArrayList arrayList, C6.b bVar) {
        String str = this.f46358e;
        if (str == null) {
            X5.a.b(X5.f46812a, "RemoteLogSender: Cannot send events without link_session_id");
            return jn0.h0.f84049a;
        }
        Object objWithContext = BuildersKt.withContext(this.f46357d, new H6(this, arrayList, str, null), bVar);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : jn0.h0.f84049a;
    }
}
