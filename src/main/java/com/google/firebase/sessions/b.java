package com.google.firebase.sessions;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.datastore.core.CorruptionException;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.FileAttribute;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import nq.j;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.jvm.internal.s;
import u6.d0;
import u6.h;
import u6.i;
import u6.x;
import vw.ApplicationInfo;
import vw.SessionData;
import vw.f0;
import vw.j0;
import vw.s0;
import vw.w0;
import vw.x0;
import vw.y0;
import vw.z0;
import wn0.l;
import yw.SessionConfigs;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0002\u0003\u0007R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/google/firebase/sessions/b;", "", "Lvw/l;", "a", "()Lvw/l;", "firebaseSessions", "Lvw/s0;", "b", "()Lvw/s0;", "sharedSessionRepository", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface b {

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\u00020\u00002\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u00020\u00002\b\b\u0001\u0010\n\u001a\u00020\u0006H'¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fH'¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010H'¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\u00020\u00002\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H'¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H&¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/google/firebase/sessions/b$a;", "", "Landroid/content/Context;", "appContext", DateTokenConverter.CONVERTER_KEY, "(Landroid/content/Context;)Lcom/google/firebase/sessions/b$a;", "Lkotlin/coroutines/CoroutineContext;", "backgroundDispatcher", "e", "(Lkotlin/coroutines/CoroutineContext;)Lcom/google/firebase/sessions/b$a;", "blockingDispatcher", "f", "Lcom/google/firebase/f;", "firebaseApp", "c", "(Lcom/google/firebase/f;)Lcom/google/firebase/sessions/b$a;", "Lzv/f;", "firebaseInstallationsApi", "b", "(Lzv/f;)Lcom/google/firebase/sessions/b$a;", "Lyv/b;", "Lnq/j;", "transportFactoryProvider", "a", "(Lyv/b;)Lcom/google/firebase/sessions/b$a;", "Lcom/google/firebase/sessions/b;", "build", "()Lcom/google/firebase/sessions/b;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface a {
        a a(yv.b<j> transportFactoryProvider);

        a b(zv.f firebaseInstallationsApi);

        b build();

        a c(com.google.firebase.f firebaseApp);

        a d(Context appContext);

        a e(@xu.a CoroutineContext backgroundDispatcher);

        a f(@xu.b CoroutineContext blockingDispatcher);
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/firebase/sessions/b$b;", "", "a", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface InterfaceC0699b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = Companion.f44806a;

        /* JADX INFO: renamed from: com.google.firebase.sessions.b$b$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jc\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\t2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0007¢\u0006\u0004\b$\u0010%J'\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u00112\u0006\u0010'\u001a\u00020&2\b\b\u0001\u0010)\u001a\u00020(H\u0007¢\u0006\u0004\b+\u0010,J/\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u00112\u0006\u0010'\u001a\u00020&2\b\b\u0001\u0010)\u001a\u00020(2\u0006\u0010.\u001a\u00020-H\u0007¢\u0006\u0004\b0\u00101¨\u00062"}, d2 = {"Lcom/google/firebase/sessions/b$b$a;", "", "<init>", "()V", "T", "Lu6/d0;", "serializer", "Lv6/b;", "corruptionHandler", "", "Lu6/f;", "migrations", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlin/Function0;", "Ljava/io/File;", "produceFile", "Lu6/h;", "f", "(Lu6/d0;Lv6/b;Ljava/util/List;Lkotlinx/coroutines/CoroutineScope;Lwn0/a;)Lu6/h;", "", "h", "()Z", "dataStoreFile", "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/io/File;)V", "Lvw/w0;", "p", "()Lvw/w0;", "Lvw/y0;", "q", "()Lvw/y0;", "Lcom/google/firebase/f;", "firebaseApp", "Lvw/b;", "e", "(Lcom/google/firebase/f;)Lvw/b;", "Landroid/content/Context;", "appContext", "Lkotlin/coroutines/CoroutineContext;", "blockingDispatcher", "Lyw/h;", "j", "(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;)Lu6/h;", "Lvw/f0;", "sessionDataSerializer", "Lvw/e0;", "m", "(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;Lvw/f0;)Lu6/h;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            static final /* synthetic */ Companion f44806a = new Companion();

            private Companion() {
            }

            private final <T> h<T> f(d0<T> serializer, v6.b<T> corruptionHandler, List<? extends u6.f<T>> migrations, CoroutineScope scope, wn0.a<? extends File> produceFile) {
                return h() ? x.f115737a.a(serializer, corruptionHandler, migrations, scope, produceFile) : i.f115493a.a(serializer, corruptionHandler, migrations, scope, produceFile);
            }

            static /* synthetic */ h g(Companion companion, d0 d0Var, v6.b bVar, List list, CoroutineScope coroutineScope, wn0.a aVar, int i11, Object obj) {
                if ((i11 & 4) != 0) {
                    list = v.m();
                }
                return companion.f(d0Var, bVar, list, coroutineScope, aVar);
            }

            private final boolean h() {
                try {
                    System.loadLibrary("datastore_shared_counter");
                    return true;
                } catch (SecurityException | UnsatisfiedLinkError unused) {
                    return false;
                }
            }

            private final void i(File dataStoreFile) throws IOException {
                File parentFile = dataStoreFile.getParentFile();
                if (parentFile == null) {
                    return;
                }
                if (parentFile.exists() && !parentFile.isDirectory() && s.f(parentFile.getName(), "firebaseSessions") && !parentFile.delete()) {
                    throw new IOException("Failed to delete conflicting file: " + parentFile);
                }
                if (parentFile.isDirectory()) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    try {
                        Files.createDirectories(parentFile.toPath(), new FileAttribute[0]);
                        return;
                    } catch (Exception e11) {
                        throw new IOException("Failed to create directory: " + parentFile, e11);
                    }
                }
                if (parentFile.mkdirs() || parentFile.isDirectory()) {
                    return;
                }
                throw new IOException("Failed to create directory: " + parentFile);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final SessionConfigs k(CorruptionException ex2) {
                s.k(ex2, "ex");
                Log.w("FirebaseSessions", "CorruptionException in session configs DataStore", ex2);
                return yw.i.f125930a.getDefaultValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final File l(Context context) throws IOException {
                File fileA = t6.a.a(context, "firebaseSessions/sessionConfigsDataStore.data");
                f44806a.i(fileA);
                return fileA;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final SessionData n(f0 f0Var, CorruptionException ex2) {
                s.k(ex2, "ex");
                Log.w("FirebaseSessions", "CorruptionException in session data DataStore", ex2);
                return f0Var.getDefaultValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final File o(Context context) throws IOException {
                File fileA = t6.a.a(context, "firebaseSessions/sessionDataStore.data");
                f44806a.i(fileA);
                return fileA;
            }

            public final ApplicationInfo e(com.google.firebase.f firebaseApp) {
                s.k(firebaseApp, "firebaseApp");
                return j0.f119948a.b(firebaseApp);
            }

            public final h<SessionConfigs> j(final Context appContext, @xu.b CoroutineContext blockingDispatcher) {
                s.k(appContext, "appContext");
                s.k(blockingDispatcher, "blockingDispatcher");
                return g(this, yw.i.f125930a, new v6.b(new l() { // from class: vw.m
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return com.google.firebase.sessions.b.InterfaceC0699b.Companion.k((CorruptionException) obj);
                    }
                }), null, CoroutineScopeKt.CoroutineScope(blockingDispatcher), new wn0.a() { // from class: vw.n
                    @Override // wn0.a
                    public final Object invoke() {
                        return com.google.firebase.sessions.b.InterfaceC0699b.Companion.l(appContext);
                    }
                }, 4, null);
            }

            public final h<SessionData> m(final Context appContext, @xu.b CoroutineContext blockingDispatcher, final f0 sessionDataSerializer) {
                s.k(appContext, "appContext");
                s.k(blockingDispatcher, "blockingDispatcher");
                s.k(sessionDataSerializer, "sessionDataSerializer");
                return g(this, sessionDataSerializer, new v6.b(new l() { // from class: vw.o
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return com.google.firebase.sessions.b.InterfaceC0699b.Companion.n(sessionDataSerializer, (CorruptionException) obj);
                    }
                }), null, CoroutineScopeKt.CoroutineScope(blockingDispatcher), new wn0.a() { // from class: vw.p
                    @Override // wn0.a
                    public final Object invoke() {
                        return com.google.firebase.sessions.b.InterfaceC0699b.Companion.o(appContext);
                    }
                }, 4, null);
            }

            public final w0 p() {
                return x0.f120062a;
            }

            public final y0 q() {
                return z0.f120065a;
            }
        }
    }

    vw.l a();

    s0 b();
}
