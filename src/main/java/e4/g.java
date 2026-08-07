package e4;

import android.content.res.Resources;
import android.util.TypedValue;
import androidx.collection.c0;
import jn0.h0;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\u0003R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u0010"}, d2 = {"Le4/g;", "", "<init>", "()V", "Landroid/content/res/Resources;", "res", "", "id", "Landroid/util/TypedValue;", "b", "(Landroid/content/res/Resources;I)Landroid/util/TypedValue;", "Ljn0/h0;", "a", "Landroidx/collection/c0;", "Landroidx/collection/c0;", "resIdPathMap", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c0<TypedValue> resIdPathMap = new c0<>(0, 1, null);

    public final void a() {
        synchronized (this) {
            this.resIdPathMap.i();
            h0 h0Var = h0.f84049a;
        }
    }

    public final TypedValue b(Resources res, int id2) {
        TypedValue typedValueC;
        synchronized (this) {
            typedValueC = this.resIdPathMap.c(id2);
            if (typedValueC == null) {
                typedValueC = new TypedValue();
                res.getValue(id2, typedValueC, true);
                this.resIdPathMap.p(id2, typedValueC);
            }
        }
        return typedValueC;
    }
}
