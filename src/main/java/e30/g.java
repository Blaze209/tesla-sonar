package e30;

import a30.ViewEnvironment;
import a30.j0;
import a30.k0;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.p003lifecycle.DefaultLifecycleObserver;
import androidx.p003lifecycle.Lifecycle;
import androidx.p003lifecycle.LifecycleOwner;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.squareup.workflow1.ui.WorkflowViewStub;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jn0.h0;
import jn0.m;
import jn0.p;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.l;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0003&\u0017\u0012B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0012\u001a\u00020\u00112\u0010\u0010\u000e\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0004¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u000fH$¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\u00112\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H$¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u001cH\u0014¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0011H\u0014¢\u0006\u0004\b$\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\"\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00160)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010*R\u001b\u00100\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010-\u001a\u0004\b.\u0010/R\u0014\u00103\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u00102¨\u00064"}, d2 = {"Le30/g;", "", "ModalRenderingT", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attributeSet", "", "defStyle", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Le30/f;", "newScreen", "La30/a0;", "viewEnvironment", "Ljn0/h0;", "c", "(Le30/f;La30/a0;)V", "initialModalRendering", "initialViewEnvironment", "Le30/g$a;", "b", "(Ljava/lang/Object;La30/a0;)Le30/g$a;", "dialogRef", DateTokenConverter.CONVERTER_KEY, "(Le30/g$a;)V", "Landroid/os/Parcelable;", "onSaveInstanceState", "()Landroid/os/Parcelable;", "state", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lcom/squareup/workflow1/ui/WorkflowViewStub;", "a", "Lcom/squareup/workflow1/ui/WorkflowViewStub;", "baseViewStub", "", "Ljava/util/List;", "dialogs", "Lb30/d;", "Lkotlin/Lazy;", "getParentLifecycleOwner", "()Lb30/d;", "parentLifecycleOwner", "Lb30/f;", "Lb30/f;", "stateRegistryAggregator", "wf1-container-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class g<ModalRenderingT> extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final WorkflowViewStub baseViewStub;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private List<a<ModalRenderingT>> dialogs;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Lazy parentLifecycleOwner;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final b30.f stateRegistryAggregator;

    /* JADX INFO: renamed from: e30.g$b, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u0019B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\nJ\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001d¨\u0006\u001f"}, d2 = {"Le30/g$b;", "Landroid/os/Parcelable;", "", "compatibilityKey", "Landroid/os/Bundle;", "bundle", "<init>", "(Ljava/lang/String;Landroid/os/Bundle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Landroid/os/Bundle;", "()Landroid/os/Bundle;", "CREATOR", "wf1-container-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class KeyAndBundle implements Parcelable {

        /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String compatibilityKey;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Bundle bundle;

        /* JADX INFO: renamed from: e30.g$b$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Le30/g$b$a;", "Landroid/os/Parcelable$Creator;", "Le30/g$b;", "<init>", "()V", "Landroid/os/Parcel;", "parcel", "a", "(Landroid/os/Parcel;)Le30/g$b;", "", "size", "", "b", "(I)[Le30/g$b;", "wf1-container-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class Companion implements Parcelable.Creator<KeyAndBundle> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public KeyAndBundle createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                String string = parcel.readString();
                s.h(string);
                s.j(string, "parcel.readString()!!");
                Bundle bundle = parcel.readBundle(KeyAndBundle.class.getClassLoader());
                s.h(bundle);
                s.j(bundle, "parcel.readBundle(KeyAnd…class.java.classLoader)!!");
                return new KeyAndBundle(string, bundle);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public KeyAndBundle[] newArray(int size) {
                return new KeyAndBundle[size];
            }

            private Companion() {
            }
        }

        public KeyAndBundle(String compatibilityKey, Bundle bundle) {
            s.k(compatibilityKey, "compatibilityKey");
            s.k(bundle, "bundle");
            this.compatibilityKey = compatibilityKey;
            this.bundle = bundle;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Bundle getBundle() {
            return this.bundle;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getCompatibilityKey() {
            return this.compatibilityKey;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof KeyAndBundle)) {
                return false;
            }
            KeyAndBundle keyAndBundle = (KeyAndBundle) other;
            return s.f(this.compatibilityKey, keyAndBundle.compatibilityKey) && s.f(this.bundle, keyAndBundle.bundle);
        }

        public int hashCode() {
            return (this.compatibilityKey.hashCode() * 31) + this.bundle.hashCode();
        }

        public String toString() {
            return "KeyAndBundle(compatibilityKey=" + this.compatibilityKey + ", bundle=" + this.bundle + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "parcel");
            parcel.writeString(this.compatibilityKey);
            parcel.writeBundle(this.bundle);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "ModalRenderingT", "Lb30/d;", "b", "()Lb30/d;"}, k = 3, mv = {1, 6, 0})
    static final class d extends u implements wn0.a<b30.d> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g<ModalRenderingT> f61663c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(g<ModalRenderingT> gVar) {
            super(0);
            this.f61663c = gVar;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final b30.d invoke() {
            b30.d dVarC = b30.d.INSTANCE.c(this.f61663c);
            if (dVarC != null) {
                return dVarC;
            }
            throw new IllegalStateException(s.t("Expected to find either a ViewTreeLifecycleOwner in the view tree, or for the context to be a LifecycleOwner, in ", this.f61663c).toString());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "ModalRenderingT", "Landroid/view/View;", "it", "Landroidx/lifecycle/Lifecycle;", "a", "(Landroid/view/View;)Landroidx/lifecycle/Lifecycle;"}, k = 3, mv = {1, 6, 0})
    static final class e extends u implements l<View, Lifecycle> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g<ModalRenderingT> f61664c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(g<ModalRenderingT> gVar) {
            super(1);
            this.f61664c = gVar;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Lifecycle invoke(View it) {
            s.k(it, "it");
            Lifecycle lifecycle = this.f61664c.getParentLifecycleOwner().getLifecycle();
            s.j(lifecycle, "parentLifecycleOwner.lifecycle");
            return lifecycle;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b*\u0002\u0000\b\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR$\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"e30/g$f", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "Ljn0/h0;", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "e30/g$f$a", "a", "Le30/g$f$a;", "()Le30/g$f$a;", "dismissOnDestroy", "Landroidx/lifecycle/Lifecycle;", "b", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "setLifecycle", "(Landroidx/lifecycle/Lifecycle;)V", "lifecycle", "wf1-container-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class f implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final a dismissOnDestroy;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private Lifecycle lifecycle;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ a<ModalRenderingT> f61667c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ g<ModalRenderingT> f61668d;

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"e30/g$f$a", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroidx/lifecycle/LifecycleOwner;", "owner", "Ljn0/h0;", "onDestroy", "(Landroidx/lifecycle/LifecycleOwner;)V", "wf1-container-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class a implements DefaultLifecycleObserver {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ a<ModalRenderingT> f61669a;

            a(a<ModalRenderingT> aVar) {
                this.f61669a = aVar;
            }

            @Override // androidx.p003lifecycle.DefaultLifecycleObserver
            public void onDestroy(LifecycleOwner owner) {
                s.k(owner, "owner");
                this.f61669a.c();
            }
        }

        f(a<ModalRenderingT> aVar, g<ModalRenderingT> gVar) {
            this.f61667c = aVar;
            this.f61668d = gVar;
            this.dismissOnDestroy = new a(aVar);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final a getDismissOnDestroy() {
            return this.dismissOnDestroy;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v11) {
            s.k(v11, "v");
            Lifecycle lifecycle = this.f61668d.getParentLifecycleOwner().getLifecycle();
            lifecycle.a(getDismissOnDestroy());
            this.lifecycle = lifecycle;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v11) {
            s.k(v11, "v");
            Lifecycle lifecycle = this.lifecycle;
            if (lifecycle != null) {
                lifecycle.d(this.dismissOnDestroy);
            }
            this.lifecycle = null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(Context context) {
        this(context, null, 0, 0, 14, null);
        s.k(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b30.d getParentLifecycleOwner() {
        return (b30.d) this.parentLifecycleOwner.getValue();
    }

    protected abstract a<ModalRenderingT> b(ModalRenderingT initialModalRendering, ViewEnvironment initialViewEnvironment);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c(e30.f<?, ? extends ModalRenderingT> newScreen, ViewEnvironment viewEnvironment) {
        ViewEnvironment viewEnvironment2;
        a<ModalRenderingT> aVarB;
        s.k(newScreen, "newScreen");
        s.k(viewEnvironment, "viewEnvironment");
        this.baseViewStub.c(newScreen.c(), viewEnvironment);
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (ModalRenderingT modalrenderingt : newScreen.b()) {
            int i12 = i11 + 1;
            if (i11 >= this.dialogs.size() || !a30.h.a(this.dialogs.get(i11).f(), modalrenderingt)) {
                viewEnvironment2 = viewEnvironment;
                aVarB = b(modalrenderingt, viewEnvironment2);
                aVarB.k(a30.g.INSTANCE.a(modalrenderingt, String.valueOf(i11)));
                View viewB = h.b(aVarB.getDialog());
                if (viewB != null) {
                    b30.d.INSTANCE.d(viewB, new e(this));
                    this.stateRegistryAggregator.h(viewB, aVarB.g());
                    viewB.addOnAttachStateChangeListener(new f(aVarB, this));
                }
                aVarB.getDialog().show();
            } else {
                viewEnvironment2 = viewEnvironment;
                aVarB = a.b(this.dialogs.get(i11), modalrenderingt, viewEnvironment2, null, null, 12, null);
                d(aVarB);
            }
            arrayList.add(aVarB);
            i11 = i12;
            viewEnvironment = viewEnvironment2;
        }
        Iterator it = v.L0(this.dialogs, arrayList).iterator();
        while (it.hasNext()) {
            ((a) it.next()).c();
        }
        b30.f fVar = this.stateRegistryAggregator;
        ArrayList arrayList2 = new ArrayList(v.y(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((a) it2.next()).g());
        }
        fVar.j(arrayList2);
        this.dialogs = arrayList;
    }

    protected abstract void d(a<ModalRenderingT> dialogRef);

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        xa.d dVarC = b30.c.f16002a.c(this);
        a30.g.Companion companion = a30.g.INSTANCE;
        j0<?> j0VarD = k0.d(this);
        Object objC = j0VarD == null ? null : j0VarD.c();
        if (objC == null) {
            objC = null;
        }
        s.h(objC);
        this.stateRegistryAggregator.f(a30.g.Companion.b(companion, objC, null, 2, null), dVarC);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.stateRegistryAggregator.g();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable state) {
        s.k(state, "state");
        h0 h0Var = null;
        c cVar = state instanceof c ? (c) state : null;
        if (cVar != null) {
            if (cVar.a().size() == this.dialogs.size()) {
                List<KeyAndBundle> listA = cVar.a();
                List<a<ModalRenderingT>> list = this.dialogs;
                Iterator<T> it = listA.iterator();
                Iterator<T> it2 = list.iterator();
                ArrayList arrayList = new ArrayList(Math.min(v.y(listA, 10), v.y(list, 10)));
                while (it.hasNext() && it2.hasNext()) {
                    ((a) it2.next()).i((KeyAndBundle) it.next());
                    arrayList.add(h0.f84049a);
                }
            }
            super.onRestoreInstanceState(((c) state).getSuperState());
            h0Var = h0.f84049a;
        }
        if (h0Var == null) {
            super.onRestoreInstanceState(super.onSaveInstanceState());
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        s.h(parcelableOnSaveInstanceState);
        List<a<ModalRenderingT>> list = this.dialogs;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((a) it.next()).j());
        }
        return new c(parcelableOnSaveInstanceState, arrayList);
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0012B!\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0016"}, d2 = {"Le30/g$c;", "Landroid/view/View$BaseSavedState;", "Landroid/os/Parcelable;", "superState", "", "Le30/g$b;", "dialogBundles", "<init>", "(Landroid/os/Parcelable;Ljava/util/List;)V", "Landroid/os/Parcel;", "source", "(Landroid/os/Parcel;)V", "out", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "CREATOR", "wf1-container-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private static final class c extends View.BaseSavedState {

        /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final List<KeyAndBundle> dialogBundles;

        /* JADX INFO: renamed from: e30.g$c$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Le30/g$c$a;", "Landroid/os/Parcelable$Creator;", "Le30/g$c;", "<init>", "()V", "Landroid/os/Parcel;", "source", "a", "(Landroid/os/Parcel;)Le30/g$c;", "", "size", "", "b", "(I)[Le30/g$c;", "wf1-container-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class Companion implements Parcelable.Creator<c> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public c createFromParcel(Parcel source) {
                s.k(source, "source");
                return new c(source);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public c[] newArray(int size) {
                return new c[size];
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Parcelable parcelable, List<KeyAndBundle> dialogBundles) {
            super(parcelable);
            s.k(dialogBundles, "dialogBundles");
            this.dialogBundles = dialogBundles;
        }

        public final List<KeyAndBundle> a() {
            return this.dialogBundles;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel out, int flags) {
            s.k(out, "out");
            super.writeToParcel(out, flags);
            out.writeTypedList(this.dialogBundles);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Parcel source) {
            super(source);
            s.k(source, "source");
            ArrayList arrayList = new ArrayList();
            source.readTypedList(arrayList, KeyAndBundle.INSTANCE);
            this.dialogBundles = arrayList;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        s.k(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
        s.k(context, "context");
    }

    public /* synthetic */ g(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0005\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\t\u0010\nJ=\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b%\u0010\u001d\u001a\u0004\b'\u0010\u001fR\"\u0010.\u001a\u00020(8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b'\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u0006/"}, d2 = {"Le30/g$a;", "", "ModalRenderingT", "modalRendering", "La30/a0;", "viewEnvironment", "Landroid/app/Dialog;", "dialog", "extra", "<init>", "(Ljava/lang/Object;La30/a0;Landroid/app/Dialog;Ljava/lang/Object;)V", "a", "(Ljava/lang/Object;La30/a0;Landroid/app/Dialog;Ljava/lang/Object;)Le30/g$a;", "Le30/g$b;", "j", "()Le30/g$b;", "keyAndBundle", "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, "(Le30/g$b;)V", "c", "()V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/Object;", "f", "()Ljava/lang/Object;", "b", "La30/a0;", "h", "()La30/a0;", "Landroid/app/Dialog;", DateTokenConverter.CONVERTER_KEY, "()Landroid/app/Dialog;", "e", "", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "k", "(Ljava/lang/String;)V", "savedStateRegistryKey", "wf1-container-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
    protected static final class a<ModalRenderingT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final ModalRenderingT modalRendering;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final ViewEnvironment viewEnvironment;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Dialog dialog;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final Object extra;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public String savedStateRegistryKey;

        public a(ModalRenderingT modalRendering, ViewEnvironment viewEnvironment, Dialog dialog, Object obj) {
            s.k(modalRendering, "modalRendering");
            s.k(viewEnvironment, "viewEnvironment");
            s.k(dialog, "dialog");
            this.modalRendering = modalRendering;
            this.viewEnvironment = viewEnvironment;
            this.dialog = dialog;
            this.extra = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ a b(a aVar, Object obj, ViewEnvironment viewEnvironment, Dialog dialog, Object obj2, int i11, Object obj3) {
            if ((i11 & 1) != 0) {
                obj = aVar.modalRendering;
            }
            if ((i11 & 2) != 0) {
                viewEnvironment = aVar.viewEnvironment;
            }
            if ((i11 & 4) != 0) {
                dialog = aVar.dialog;
            }
            if ((i11 & 8) != 0) {
                obj2 = aVar.extra;
            }
            return aVar.a(obj, viewEnvironment, dialog, obj2);
        }

        public final a<ModalRenderingT> a(ModalRenderingT modalRendering, ViewEnvironment viewEnvironment, Dialog dialog, Object extra) {
            s.k(modalRendering, "modalRendering");
            s.k(viewEnvironment, "viewEnvironment");
            s.k(dialog, "dialog");
            a<ModalRenderingT> aVar = new a<>(modalRendering, viewEnvironment, dialog, extra);
            aVar.k(g());
            return aVar;
        }

        public final void c() {
            b30.d dVarC;
            View viewB = h.b(this.dialog);
            if (viewB != null && (dVarC = b30.d.INSTANCE.c(viewB)) != null) {
                dVarC.o();
            }
            this.dialog.dismiss();
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Dialog getDialog() {
            return this.dialog;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Object getExtra() {
            return this.extra;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!s.f(a.class, other == null ? null : other.getClass())) {
                return false;
            }
            if (other != null) {
                return s.f(this.dialog, ((a) other).dialog);
            }
            throw new NullPointerException("null cannot be cast to non-null type com.squareup.workflow1.ui.modal.ModalContainer.DialogRef<*>");
        }

        public final ModalRenderingT f() {
            return this.modalRendering;
        }

        public final String g() {
            String str = this.savedStateRegistryKey;
            if (str != null) {
                return str;
            }
            s.B("savedStateRegistryKey");
            return null;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final ViewEnvironment getViewEnvironment() {
            return this.viewEnvironment;
        }

        public int hashCode() {
            return this.dialog.hashCode();
        }

        public final void i(KeyAndBundle keyAndBundle) {
            s.k(keyAndBundle, "keyAndBundle");
            if (s.f(a30.g.Companion.b(a30.g.INSTANCE, this.modalRendering, null, 2, null), keyAndBundle.getCompatibilityKey())) {
                Window window = this.dialog.getWindow();
                s.h(window);
                window.restoreHierarchyState(keyAndBundle.getBundle());
            }
        }

        public final KeyAndBundle j() {
            Window window = this.dialog.getWindow();
            s.h(window);
            Bundle saved = window.saveHierarchyState();
            String strB = a30.g.Companion.b(a30.g.INSTANCE, this.modalRendering, null, 2, null);
            s.j(saved, "saved");
            return new KeyAndBundle(strB, saved);
        }

        public final void k(String str) {
            s.k(str, "<set-?>");
            this.savedStateRegistryKey = str;
        }

        public /* synthetic */ a(Object obj, ViewEnvironment viewEnvironment, Dialog dialog, Object obj2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, viewEnvironment, dialog, (i11 & 8) != 0 ? null : obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        s.k(context, "context");
        WorkflowViewStub workflowViewStub = new WorkflowViewStub(context, null, 0, 0, 14, null);
        addView(workflowViewStub, new ViewGroup.LayoutParams(-1, -1));
        this.baseViewStub = workflowViewStub;
        this.dialogs = v.m();
        this.parentLifecycleOwner = m.a(p.NONE, new d(this));
        this.stateRegistryAggregator = new b30.f();
    }
}
