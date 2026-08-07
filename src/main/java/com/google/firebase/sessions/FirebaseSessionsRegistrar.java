package com.google.firebase.sessions;

import android.content.Context;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import java.util.List;
import kotlinx.coroutines.CoroutineDispatcher;
import nq.j;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import qw.h;
import u6.x;
import vw.l;
import yu.a0;
import yu.q;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0001\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\b\u001a0\u0012,\u0012*\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0014\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00050\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Lyu/c;", "", "kotlin.jvm.PlatformType", "getComponents", "()Ljava/util/List;", "Companion", "a", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {
    private static final a Companion = new a(null);

    @Deprecated
    public static final String LIBRARY_NAME = "fire-sessions";
    private static final a0<Context> appContext;
    private static final a0<CoroutineDispatcher> backgroundDispatcher;
    private static final a0<CoroutineDispatcher> blockingDispatcher;
    private static final a0<com.google.firebase.f> firebaseApp;
    private static final a0<zv.f> firebaseInstallationsApi;
    private static final a0<b> firebaseSessionsComponent;
    private static final a0<j> transportFactory;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsRegistrar$a;", "", "<init>", "()V", "", "LIBRARY_NAME", "Ljava/lang/String;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        a0<Context> a0VarB = a0.b(Context.class);
        s.j(a0VarB, "unqualified(...)");
        appContext = a0VarB;
        a0<com.google.firebase.f> a0VarB2 = a0.b(com.google.firebase.f.class);
        s.j(a0VarB2, "unqualified(...)");
        firebaseApp = a0VarB2;
        a0<zv.f> a0VarB3 = a0.b(zv.f.class);
        s.j(a0VarB3, "unqualified(...)");
        firebaseInstallationsApi = a0VarB3;
        a0<CoroutineDispatcher> a0VarA = a0.a(xu.a.class, CoroutineDispatcher.class);
        s.j(a0VarA, "qualified(...)");
        backgroundDispatcher = a0VarA;
        a0<CoroutineDispatcher> a0VarA2 = a0.a(xu.b.class, CoroutineDispatcher.class);
        s.j(a0VarA2, "qualified(...)");
        blockingDispatcher = a0VarA2;
        a0<j> a0VarB4 = a0.b(j.class);
        s.j(a0VarB4, "unqualified(...)");
        transportFactory = a0VarB4;
        a0<b> a0VarB5 = a0.b(b.class);
        s.j(a0VarB5, "unqualified(...)");
        firebaseSessionsComponent = a0VarB5;
        try {
            x.f115737a.getClass();
        } catch (NoClassDefFoundError unused) {
            Log.w("FirebaseSessions", "Your app is experiencing a known issue in the Android Gradle plugin, see https://issuetracker.google.com/328687152\n\nIt affects Java-only apps using AGP version 8.3.2 and under. To avoid the issue, either:\n\n1. Upgrade Android Gradle plugin to 8.4.0+\n   Follow the guide at https://developer.android.com/build/agp-upgrade-assistant\n\n2. Or, add the Kotlin plugin to your app\n   Follow the guide at https://developer.android.com/kotlin/add-kotlin\n\n3. Or, do the technical workaround described in https://issuetracker.google.com/issues/328687152#comment3");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l getComponents$lambda$0(yu.d dVar) {
        return ((b) dVar.d(firebaseSessionsComponent)).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b getComponents$lambda$1(yu.d dVar) {
        b.a aVarA = com.google.firebase.sessions.a.a();
        Object objD = dVar.d(appContext);
        s.j(objD, "get(...)");
        b.a aVarD = aVarA.d((Context) objD);
        Object objD2 = dVar.d(backgroundDispatcher);
        s.j(objD2, "get(...)");
        b.a aVarE = aVarD.e((CoroutineContext) objD2);
        Object objD3 = dVar.d(blockingDispatcher);
        s.j(objD3, "get(...)");
        b.a aVarF = aVarE.f((CoroutineContext) objD3);
        Object objD4 = dVar.d(firebaseApp);
        s.j(objD4, "get(...)");
        b.a aVarC = aVarF.c((com.google.firebase.f) objD4);
        Object objD5 = dVar.d(firebaseInstallationsApi);
        s.j(objD5, "get(...)");
        b.a aVarB = aVarC.b((zv.f) objD5);
        yv.b<j> bVarE = dVar.e(transportFactory);
        s.j(bVarE, "getProvider(...)");
        return aVarB.a(bVarE).build();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<yu.c<? extends Object>> getComponents() {
        return v.p(yu.c.c(l.class).h(LIBRARY_NAME).b(q.l(firebaseSessionsComponent)).f(new yu.g() { // from class: vw.q
            @Override // yu.g
            public final Object a(yu.d dVar) {
                return FirebaseSessionsRegistrar.getComponents$lambda$0(dVar);
            }
        }).e().d(), yu.c.c(b.class).h("fire-sessions-component").b(q.l(appContext)).b(q.l(backgroundDispatcher)).b(q.l(blockingDispatcher)).b(q.l(firebaseApp)).b(q.l(firebaseInstallationsApi)).b(q.n(transportFactory)).f(new yu.g() { // from class: vw.r
            @Override // yu.g
            public final Object a(yu.d dVar) {
                return FirebaseSessionsRegistrar.getComponents$lambda$1(dVar);
            }
        }).d(), h.b(LIBRARY_NAME, "3.0.3"));
    }
}
