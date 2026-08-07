package u6;

import ch.qos.logback.core.joran.action.Action;
import com.plaid.internal.EnumC4419g;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lu6/p;", "T", "Lu6/m;", "Lu6/o0;", "Ljava/io/File;", Action.FILE_ATTRIBUTE, "Lu6/d0;", "serializer", "<init>", "(Ljava/io/File;Lu6/d0;)V", "value", "Ljn0/h0;", "a", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class p<T> extends m<T> implements o0<T> {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.FileWriteScope", f = "FileStorage.kt", i = {0}, l = {EnumC4419g.SDK_ASSET_ICON_CHEVRON_LEFT_DOUBLE_S2_VALUE}, m = "writeData", n = {"stream"}, s = {"L$1"})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f115689n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f115690o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f115691p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ p<T> f115692q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f115693r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p<T> pVar, Continuation<? super a> continuation) {
            super(continuation);
            this.f115692q = pVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f115691p = obj;
            this.f115693r |= Integer.MIN_VALUE;
            return this.f115692q.a(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(File file, d0<T> serializer) {
        super(file, serializer);
        p013kotlin.jvm.internal.s.k(file, "file");
        p013kotlin.jvm.internal.s.k(serializer, "serializer");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // u6.o0
    public Object a(T t11, Continuation<? super jn0.h0> continuation) {
        a aVar;
        Closeable closeable;
        FileOutputStream fileOutputStream;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f115693r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f115693r = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, continuation);
            }
        } else {
            aVar = new a(this, continuation);
        }
        Object obj = aVar.f115691p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f115693r;
        if (i12 == 0) {
            jn0.t.b(obj);
            f();
            FileOutputStream fileOutputStream2 = new FileOutputStream(getCh.qos.logback.core.joran.action.Action.FILE_ATTRIBUTE java.lang.String());
            try {
                d0<T> d0VarH = h();
                m0 m0Var = new m0(fileOutputStream2);
                aVar.f115689n = fileOutputStream2;
                aVar.f115690o = fileOutputStream2;
                aVar.f115693r = 1;
                if (d0VarH.a(t11, m0Var, aVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                fileOutputStream = fileOutputStream2;
                closeable = fileOutputStream;
            } catch (Throwable th2) {
                th = th2;
                closeable = fileOutputStream2;
                throw th;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fileOutputStream = (FileOutputStream) aVar.f115690o;
            closeable = (Closeable) aVar.f115689n;
            try {
                jn0.t.b(obj);
            } catch (Throwable th3) {
                th = th3;
                try {
                    throw th;
                } catch (Throwable th4) {
                    sn0.b.a(closeable, th);
                    throw th4;
                }
            }
        }
        fileOutputStream.getFD().sync();
        jn0.h0 h0Var = jn0.h0.f84049a;
        sn0.b.a(closeable, null);
        return jn0.h0.f84049a;
    }
}
