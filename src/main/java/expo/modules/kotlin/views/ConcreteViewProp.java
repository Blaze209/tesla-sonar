package expo.modules.kotlin.views;

import android.view.View;
import com.facebook.react.bridge.Dynamic;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.PropSetException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.types.AnyType;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u0004\b\u0001\u0010\u00032\u00020\u0004B1\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R,\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\n0\t8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, d2 = {"Lexpo/modules/kotlin/views/ConcreteViewProp;", "Landroid/view/View;", "ViewType", "PropType", "Lexpo/modules/kotlin/views/AnyViewProp;", "", "name", "Lexpo/modules/kotlin/types/AnyType;", "propType", "Lkotlin/Function2;", "Ljn0/h0;", "setter", "<init>", "(Ljava/lang/String;Lexpo/modules/kotlin/types/AnyType;Lwn0/p;)V", "Lcom/facebook/react/bridge/Dynamic;", "prop", "onView", "Lexpo/modules/kotlin/AppContext;", "appContext", "set", "(Lcom/facebook/react/bridge/Dynamic;Landroid/view/View;Lexpo/modules/kotlin/AppContext;)V", "Lwn0/p;", "getSetter", "()Lwn0/p;", "", "isNullable", "Z", "()Z", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class ConcreteViewProp<ViewType extends View, PropType> extends AnyViewProp {
    private final boolean isNullable;
    private final p<ViewType, PropType, h0> setter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConcreteViewProp(String name, AnyType propType, p<? super ViewType, ? super PropType, h0> setter) {
        super(name, propType);
        s.k(name, "name");
        s.k(propType, "propType");
        s.k(setter, "setter");
        this.setter = setter;
        this.isNullable = propType.getKType().getIsMarkedNullable();
    }

    protected final p<ViewType, PropType, h0> getSetter() {
        return this.setter;
    }

    @Override // expo.modules.kotlin.views.AnyViewProp
    /* JADX INFO: renamed from: isNullable, reason: from getter */
    public boolean getIsNullable() {
        return this.isNullable;
    }

    @Override // expo.modules.kotlin.views.AnyViewProp
    public void set(Dynamic prop, View onView, AppContext appContext) throws PropSetException {
        CodedException unexpectedException;
        s.k(prop, "prop");
        s.k(onView, "onView");
        try {
            this.setter.invoke((ViewType) onView, (PropType) getType().convert(prop, appContext));
            h0 h0Var = h0.f84049a;
        } catch (Throwable th2) {
            if (th2 instanceof CodedException) {
                unexpectedException = (CodedException) th2;
            } else if (th2 instanceof expo.modules.core.errors.CodedException) {
                expo.modules.core.errors.CodedException codedException = (expo.modules.core.errors.CodedException) th2;
                String code = codedException.getCode();
                s.j(code, "getCode(...)");
                unexpectedException = new CodedException(code, codedException.getMessage(), codedException.getCause());
            } else {
                unexpectedException = new UnexpectedException(th2);
            }
            throw new PropSetException(getName(), o0.b(onView.getClass()), unexpectedException);
        }
    }
}
