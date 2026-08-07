package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import ch.qos.logback.core.joran.action.Action;

/* JADX INFO: loaded from: classes.dex */
class b0 implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final FragmentManager f8486a;

    class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p0 f8487a;

        a(p0 p0Var) {
            this.f8487a = p0Var;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Fragment fragmentK = this.f8487a.k();
            this.f8487a.m();
            a1.u((ViewGroup) fragmentK.mView.getParent(), b0.this.f8486a).q();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    b0(FragmentManager fragmentManager) {
        this.f8486a = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(@NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        p0 p0VarA;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f8486a);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, Action.CLASS_ATTRIBUTE);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f7.c.f64527a);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(f7.c.f64528b);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(f7.c.f64529c, -1);
        String string = typedArrayObtainStyledAttributes.getString(f7.c.f64530d);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue == null || !y.isFragmentClass(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id2 = view != null ? view.getId() : 0;
        if (id2 == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        Fragment fragmentN0 = resourceId != -1 ? this.f8486a.n0(resourceId) : null;
        if (fragmentN0 == null && string != null) {
            fragmentN0 = this.f8486a.o0(string);
        }
        if (fragmentN0 == null && id2 != -1) {
            fragmentN0 = this.f8486a.n0(id2);
        }
        if (fragmentN0 == null) {
            fragmentN0 = this.f8486a.z0().instantiate(context.getClassLoader(), attributeValue);
            fragmentN0.mFromLayout = true;
            fragmentN0.mFragmentId = resourceId != 0 ? resourceId : id2;
            fragmentN0.mContainerId = id2;
            fragmentN0.mTag = string;
            fragmentN0.mInLayout = true;
            FragmentManager fragmentManager = this.f8486a;
            fragmentN0.mFragmentManager = fragmentManager;
            fragmentN0.mHost = fragmentManager.B0();
            fragmentN0.onInflate(this.f8486a.B0().getCh.qos.logback.core.CoreConstants.CONTEXT_SCOPE_VALUE java.lang.String(), attributeSet, fragmentN0.mSavedFragmentState);
            p0VarA = this.f8486a.l(fragmentN0);
            if (FragmentManager.O0(2)) {
                Log.v("FragmentManager", "Fragment " + fragmentN0 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        } else {
            if (fragmentN0.mInLayout) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + attributeValue);
            }
            fragmentN0.mInLayout = true;
            FragmentManager fragmentManager2 = this.f8486a;
            fragmentN0.mFragmentManager = fragmentManager2;
            fragmentN0.mHost = fragmentManager2.B0();
            fragmentN0.onInflate(this.f8486a.B0().getCh.qos.logback.core.CoreConstants.CONTEXT_SCOPE_VALUE java.lang.String(), attributeSet, fragmentN0.mSavedFragmentState);
            p0VarA = this.f8486a.A(fragmentN0);
            if (FragmentManager.O0(2)) {
                Log.v("FragmentManager", "Retained Fragment " + fragmentN0 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        }
        ViewGroup viewGroup = (ViewGroup) view;
        g7.b.g(fragmentN0, viewGroup);
        fragmentN0.mContainer = viewGroup;
        p0VarA.m();
        p0VarA.j();
        View view2 = fragmentN0.mView;
        if (view2 == null) {
            throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        if (resourceId != 0) {
            view2.setId(resourceId);
        }
        if (fragmentN0.mView.getTag() == null) {
            fragmentN0.mView.setTag(string);
        }
        fragmentN0.mView.addOnAttachStateChangeListener(new a(p0VarA));
        return fragmentN0.mView;
    }
}
