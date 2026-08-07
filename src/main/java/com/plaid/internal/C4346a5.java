package com.plaid.internal;

import com.plaid.internal.core.crashreporting.internal.models.Crash;
import com.plaid.internal.core.crashreporting.internal.models.CrashLogLevel;
import com.plaid.internal.core.crashreporting.internal.models.DebugImage;
import com.plaid.internal.core.crashreporting.internal.models.DebugMetaInterface;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.plaid.internal.a5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.core.crashreporting.PlaidCrashReporter$logMessage$1", f = "PlaidCrashReporter.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, s = {})
public final class C4346a5 extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f46862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4364c5 f46863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f46864c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4346a5(C4364c5 c4364c5, String str, Continuation<? super C4346a5> continuation) {
        super(2, continuation);
        this.f46863b = c4364c5;
        this.f46864c = str;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
        return new C4346a5(this.f46863b, this.f46864c, continuation);
    }

    @Override // wn0.p
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
        return new C4346a5(this.f46863b, this.f46864c, continuation).invokeSuspend(jn0.h0.f84049a);
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List listSubList;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f46862a;
        if (i11 == 0) {
            jn0.t.b(obj);
            C4364c5 c4364c5 = this.f46863b;
            S6 s11 = c4364c5.f46902a;
            C4350b0 c4350b0 = c4364c5.f46903b;
            String message = this.f46864c;
            c4350b0.getClass();
            p013kotlin.jvm.internal.s.k(message, "message");
            UUID uuidRandomUUID = UUID.randomUUID();
            c4350b0.f46881f = uuidRandomUUID;
            p013kotlin.jvm.internal.s.h(uuidRandomUUID);
            String string = uuidRandomUUID.toString();
            p013kotlin.jvm.internal.s.j(string, "toString(...)");
            String strV = p013kotlin.text.t.V(string, "-", "", false, 4, null);
            String str = ((SimpleDateFormat) c4350b0.f46882g.getValue()).format(new Date());
            p013kotlin.jvm.internal.s.j(str, "format(...)");
            CrashLogLevel crashLogLevel = CrashLogLevel.WARNING;
            String release = c4350b0.f46877b.getRelease();
            if (p013kotlin.text.t.h0(message, "com.plaid.internal.core.networking.models.NetworkException", false, 2, null)) {
                try {
                    listSubList = p013kotlin.text.t.f1(message, new String[]{"\n"}, false, 0, 6, null).subList(0, 1);
                } catch (Throwable unused) {
                    listSubList = null;
                }
            } else {
                listSubList = null;
            }
            String strA = c4350b0.f46878c.a();
            DebugMetaInterface debugMetaInterface = new DebugMetaInterface();
            debugMetaInterface.getDebugImages().add(new DebugImage(new String[]{"ea5ac326-896b-556a-a06f-7208ae64a9ed"}[0], null, 2, null));
            Crash crashA = c4350b0.a(new Crash(strV, message, str, crashLogLevel, null, null, null, null, null, null, null, release, null, strA, null, listSubList, null, null, debugMetaInterface, 219120, null));
            this.f46862a = 1;
            if (s11.a(crashA, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
        }
        return jn0.h0.f84049a;
    }
}
