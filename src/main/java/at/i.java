package at;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.Property;
import androidx.annotation.NonNull;
import androidx.collection.x0;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x0<String, j> f14985a = new x0<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x0<String, PropertyValuesHolder[]> f14986b = new x0<>();

    private static void a(@NonNull i iVar, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            iVar.l(objectAnimator.getPropertyName(), objectAnimator.getValues());
            iVar.m(objectAnimator.getPropertyName(), j.b(objectAnimator));
        } else {
            throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
        }
    }

    @NonNull
    private PropertyValuesHolder[] b(@NonNull PropertyValuesHolder[] propertyValuesHolderArr) {
        PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[propertyValuesHolderArr.length];
        for (int i11 = 0; i11 < propertyValuesHolderArr.length; i11++) {
            propertyValuesHolderArr2[i11] = propertyValuesHolderArr[i11].clone();
        }
        return propertyValuesHolderArr2;
    }

    public static i c(@NonNull Context context, @NonNull TypedArray typedArray, int i11) {
        int resourceId;
        if (!typedArray.hasValue(i11) || (resourceId = typedArray.getResourceId(i11, 0)) == 0) {
            return null;
        }
        return d(context, resourceId);
    }

    public static i d(@NonNull Context context, int i11) {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i11);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return e(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return e(arrayList);
        } catch (Exception e11) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i11), e11);
            return null;
        }
    }

    @NonNull
    private static i e(@NonNull List<Animator> list) {
        i iVar = new i();
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            a(iVar, list.get(i11));
        }
        return iVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            return this.f14985a.equals(((i) obj).f14985a);
        }
        return false;
    }

    @NonNull
    public <T> ObjectAnimator f(@NonNull String str, @NonNull T t11, @NonNull Property<T, ?> property) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(t11, g(str));
        objectAnimatorOfPropertyValuesHolder.setProperty(property);
        h(str).a(objectAnimatorOfPropertyValuesHolder);
        return objectAnimatorOfPropertyValuesHolder;
    }

    @NonNull
    public PropertyValuesHolder[] g(String str) {
        if (j(str)) {
            return b(this.f14986b.get(str));
        }
        throw new IllegalArgumentException();
    }

    public j h(String str) {
        if (k(str)) {
            return this.f14985a.get(str);
        }
        throw new IllegalArgumentException();
    }

    public int hashCode() {
        return this.f14985a.hashCode();
    }

    public long i() {
        int size = this.f14985a.getSize();
        long jMax = 0;
        for (int i11 = 0; i11 < size; i11++) {
            j jVarM = this.f14985a.m(i11);
            jMax = Math.max(jMax, jVarM.c() + jVarM.d());
        }
        return jMax;
    }

    public boolean j(String str) {
        return this.f14986b.get(str) != null;
    }

    public boolean k(String str) {
        return this.f14985a.get(str) != null;
    }

    public void l(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f14986b.put(str, propertyValuesHolderArr);
    }

    public void m(String str, j jVar) {
        this.f14985a.put(str, jVar);
    }

    @NonNull
    public String toString() {
        return '\n' + getClass().getName() + CoreConstants.CURLY_LEFT + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f14985a + "}\n";
    }
}
