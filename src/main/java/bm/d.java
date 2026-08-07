package bm;

import android.util.Log;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.List;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\u0005\b\u0016\u0018\u0000 \"*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001#B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u0001\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0001\u0010\tJ+\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00018\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0011J+\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR \u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010 ¨\u0006$"}, d2 = {"Lbm/d;", "I", "Lbm/a;", "<init>", "()V", "Lbm/b;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ljn0/h0;", "H", "(Lbm/b;)V", "", "id", "", "callerContext", "Lbm/b$a;", "extras", "C", "(Ljava/lang/String;Ljava/lang/Object;Lbm/b$a;)V", "imageInfo", "extraData", "p", "", "throwable", "B", "(Ljava/lang/String;Ljava/lang/Throwable;Lbm/b$a;)V", "t", "(Ljava/lang/String;Lbm/b$a;)V", "c", "(Ljava/lang/String;Ljava/lang/Object;)V", "n", "(Ljava/lang/String;)V", "", "Ljava/util/List;", "listeners", DateTokenConverter.CONVERTER_KEY, "a", "ui-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class d<I> extends a<I> {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<b<I>> listeners = new ArrayList(2);

    @Override // bm.a, bm.b
    public void B(String id2, Throwable throwable, b.a extras) {
        s.k(id2, "id");
        int size = this.listeners.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                try {
                    this.listeners.get(i11).B(id2, throwable, extras);
                    h0 h0Var = h0.f84049a;
                } catch (Exception e11) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onFailure", e11);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // bm.a, bm.b
    public void C(String id2, Object callerContext, b.a extras) {
        s.k(id2, "id");
        int size = this.listeners.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                try {
                    this.listeners.get(i11).C(id2, callerContext, extras);
                    h0 h0Var = h0.f84049a;
                } catch (Exception e11) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onSubmit", e11);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    public final synchronized void H(b<I> listener) {
        s.k(listener, "listener");
        this.listeners.add(listener);
    }

    public final synchronized void I(b<I> listener) {
        s.k(listener, "listener");
        this.listeners.remove(listener);
    }

    @Override // bm.a, bm.b
    public void c(String id2, I imageInfo) {
        s.k(id2, "id");
        int size = this.listeners.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                try {
                    this.listeners.get(i11).c(id2, imageInfo);
                    h0 h0Var = h0.f84049a;
                } catch (Exception e11) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onIntermediateImageSet", e11);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // bm.a, bm.b
    public void n(String id2) {
        s.k(id2, "id");
        int size = this.listeners.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                try {
                    this.listeners.get(i11).n(id2);
                    h0 h0Var = h0.f84049a;
                } catch (Exception e11) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onIntermediateImageFailed", e11);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // bm.a, bm.b
    public void p(String id2, I imageInfo, b.a extraData) {
        s.k(id2, "id");
        int size = this.listeners.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                try {
                    this.listeners.get(i11).p(id2, imageInfo, extraData);
                    h0 h0Var = h0.f84049a;
                } catch (Exception e11) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onFinalImageSet", e11);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // bm.a, bm.b
    public void t(String id2, b.a extras) {
        s.k(id2, "id");
        int size = this.listeners.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                try {
                    this.listeners.get(i11).t(id2, extras);
                    h0 h0Var = h0.f84049a;
                } catch (Exception e11) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onRelease", e11);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }
}
