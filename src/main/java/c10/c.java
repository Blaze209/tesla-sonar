package c10;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.common.internal.ImagesContract;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import jn0.h0;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.n0;
import p013kotlin.jvm.internal.s;
import wn0.l;
import wn0.t;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u001a%\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\b\u001a\u00020\u0003*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\b\u0010\t\u001aI\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\r*\u00020\u000020\u0010\u0004\u001a,\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\n¢\u0006\u0004\b\u000e\u0010\u000f\"\u0015\u0010\u0012\u001a\u00020\u000b*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\"\u0017\u0010\u0015\u001a\u00020\u0002*\u0004\u0018\u00010\u00008F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroid/widget/EditText;", "Lkotlin/Function1;", "", "Ljn0/h0;", "action", "Landroid/text/TextWatcher;", DateTokenConverter.CONVERTER_KEY, "(Landroid/widget/EditText;Lwn0/l;)Landroid/text/TextWatcher;", "e", "(Landroid/widget/EditText;)V", "Lkotlin/Function6;", "", "", "Lkotlin/Function0;", "b", "(Landroid/widget/EditText;Lwn0/t;)Lwn0/a;", "g", "(Landroid/widget/EditText;)I", "parentScrollViewTarget", "f", "(Landroid/widget/EditText;)Ljava/lang/String;", "keyboardType", "react-native-keyboard-controller_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class c {
    public static final wn0.a<h0> b(EditText editText, t<? super Integer, ? super Integer, ? super Double, ? super Double, ? super Double, ? super Double, h0> action) {
        s.k(editText, "<this>");
        s.k(action, "action");
        final e eVar = new e(editText, action);
        eVar.j();
        return new wn0.a() { // from class: c10.b
            @Override // wn0.a
            public final Object invoke() {
                return c.c(eVar);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 c(e eVar) {
        eVar.i();
        return h0.f84049a;
    }

    public static final TextWatcher d(EditText editText, l<? super String, h0> action) throws IllegalAccessException {
        s.k(editText, "<this>");
        s.k(action, "action");
        a aVar = new a(new n0(), action);
        try {
            Field declaredField = com.facebook.react.views.textinput.j.class.getDeclaredField("k");
            s.j(declaredField, "getDeclaredField(...)");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(editText);
            ArrayList arrayList = obj instanceof ArrayList ? (ArrayList) obj : null;
            if (arrayList != null) {
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (!(it.next() instanceof TextWatcher)) {
                        }
                    }
                }
                arrayList.add(0, aVar);
                return aVar;
            }
            g10.a.d(g10.a.f67023a, editText.getClass().getSimpleName(), "Can not attach listener because `fieldValue` does not belong to `ArrayList<TextWatcher>`", null, 4, null);
            return aVar;
        } catch (ClassCastException e11) {
            g10.a.d(g10.a.f67023a, editText.getClass().getSimpleName(), "Can not attach listener because casting failed: " + e11.getMessage(), null, 4, null);
            return aVar;
        } catch (IllegalArgumentException e12) {
            g10.a.d(g10.a.f67023a, editText.getClass().getSimpleName(), "Can not attach listener to be the first in the list: " + e12.getMessage() + ". Attaching to the end...", null, 4, null);
            editText.addTextChangedListener(aVar);
            return aVar;
        } catch (NoSuchFieldException e13) {
            g10.a.d(g10.a.f67023a, editText.getClass().getSimpleName(), "Can not attach listener because field `mListeners` not found: " + e13.getMessage() + ". Attaching to the end...", null, 4, null);
            editText.addTextChangedListener(aVar);
            return aVar;
        }
    }

    public static final void e(EditText editText) {
        if (editText instanceof com.facebook.react.views.textinput.j) {
            ((com.facebook.react.views.textinput.j) editText).P();
        } else if (editText != null) {
            editText.requestFocus();
        }
    }

    public static final String f(EditText editText) {
        if (editText == null) {
            return "default";
        }
        int inputType = editText.getInputType() & 15;
        int inputType2 = editText.getInputType() & 4080;
        if (inputType2 == 32) {
            return "email-address";
        }
        if (inputType2 == 16) {
            return ImagesContract.URL;
        }
        if (inputType2 == 144) {
            return "visible-password";
        }
        if (inputType != 2) {
            return inputType == 3 ? "phone-pad" : "default";
        }
        if ((editText.getInputType() & PKIFailureInfo.certRevoked) == 0 || (editText.getInputType() & 4096) != 0) {
            return (editText.getInputType() & 4096) != 0 ? "numeric" : "number-pad";
        }
        return "decimal-pad";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.widget.EditText, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public static final int g(EditText editText) {
        s.k(editText, "<this>");
        while (editText != 0) {
            Object parent = editText.getParent();
            editText = parent instanceof View ? (View) parent : 0;
            if (editText instanceof com.facebook.react.views.scroll.g) {
                com.facebook.react.views.scroll.g gVar = (com.facebook.react.views.scroll.g) editText;
                if (gVar.getScrollEnabled()) {
                    return gVar.getId();
                }
            }
        }
        return -1;
    }

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\f\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ1\u0010\u000f\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"c10/c$a", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "Ljn0/h0;", "afterTextChanged", "(Landroid/text/Editable;)V", "", "", "start", "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "react-native-keyboard-controller_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n0<String> f18559a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l<String, h0> f18560b;

        /* JADX WARN: Multi-variable type inference failed */
        a(n0<String> n0Var, l<? super String, h0> lVar) {
            this.f18559a = n0Var;
            this.f18560b = lVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object, java.lang.String] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s11, int start, int before, int count) {
            ?? ValueOf = String.valueOf(s11);
            if (s.f(ValueOf, this.f18559a.f86529a)) {
                return;
            }
            this.f18559a.f86529a = ValueOf;
            this.f18560b.invoke(ValueOf);
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s11) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s11, int start, int count, int after) {
        }
    }
}
