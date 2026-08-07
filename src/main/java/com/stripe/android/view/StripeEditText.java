package com.stripe.android.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.HideReturnsTransformationMethod;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.textfield.TextInputEditText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0097\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010!\n\u0002\b\u000e\n\u0002\b\u0019*\u0001s\b\u0017\u0018\u00002\u00020\u0001:\n\u0086\u0001\u0087\u0001\u0088\u0001\u0089\u0001\u008a\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u0010J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\f2\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\f2\b\b\u0001\u0010&\u001a\u00020\u0006¢\u0006\u0004\b'\u0010\u0010J\u0017\u0010*\u001a\u00020\f2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J\u0019\u00100\u001a\u00020\f2\b\u0010/\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u00020\f2\b\u00103\u001a\u0004\u0018\u000102¢\u0006\u0004\b4\u00105J\u0011\u00106\u001a\u0004\u0018\u000102H\u0016¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\n 8*\u0004\u0018\u00010202H\u0007¢\u0006\u0004\b9\u00107J\u0019\u0010<\u001a\u00020\f2\b\u0010;\u001a\u0004\u0018\u00010:H\u0016¢\u0006\u0004\b<\u0010=J\u0019\u0010>\u001a\u00020\f2\b\u0010;\u001a\u0004\u0018\u00010:H\u0016¢\u0006\u0004\b>\u0010=J\u0019\u0010C\u001a\u00020\f2\b\u0010@\u001a\u0004\u0018\u00010?H\u0000¢\u0006\u0004\bA\u0010BJ\u000f\u0010D\u001a\u00020\fH\u0007¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020\fH\u0002¢\u0006\u0004\bF\u0010EJ\u000f\u0010G\u001a\u00020\fH\u0002¢\u0006\u0004\bG\u0010EJ\u000f\u0010H\u001a\u00020\fH\u0002¢\u0006\u0004\bH\u0010EJ\u0017\u0010K\u001a\u00020J2\u0006\u0010I\u001a\u00020\u0006H\u0002¢\u0006\u0004\bK\u0010LR(\u0010S\u001a\u00020J8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bK\u0010M\u0012\u0004\bR\u0010E\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010TR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010UR*\u0010\\\u001a\u00020\n2\u0006\u0010V\u001a\u00020\n8\u0000@AX\u0080\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\u000eR\u0018\u0010]\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010XR\u0016\u0010`\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0018\u0010c\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u001e\u0010g\u001a\n\u0012\u0004\u0012\u00020:\u0018\u00010d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR*\u0010h\u001a\u00020J2\u0006\u0010h\u001a\u00020J8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bi\u0010M\u001a\u0004\bj\u0010O\"\u0004\bk\u0010QR$\u0010#\u001a\u0004\u0018\u00010\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010%R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010v\u001a\u00020s8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR \u0010z\u001a\b\u0012\u0004\u0012\u0002020d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bw\u0010f\u001a\u0004\bx\u0010yR\u0018\u0010}\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010|R\u001d\u0010\u0080\u0001\u001a\u0004\u0018\u00010\"8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b~\u0010m\u001a\u0004\b\u007f\u0010oR\u0016\u0010\u0082\u0001\u001a\u00020\"8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010oR\u0014\u0010\u0085\u0001\u001a\u00020\u00068G¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001¨\u0006\u008b\u0001"}, d2 = {"Lcom/stripe/android/view/StripeEditText;", "Lcom/google/android/material/textfield/TextInputEditText;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/content/res/ColorStateList;", "colors", "Ljn0/h0;", "setTextColor", "(Landroid/content/res/ColorStateList;)V", "color", "(I)V", "Landroid/view/inputmethod/EditorInfo;", "outAttrs", "Landroid/view/inputmethod/InputConnection;", "onCreateInputConnection", "(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;", "Lcom/stripe/android/view/StripeEditText$a;", "afterTextChangedListener", "setAfterTextChangedListener", "(Lcom/stripe/android/view/StripeEditText$a;)V", "Lcom/stripe/android/view/StripeEditText$b;", "deleteEmptyListener", "setDeleteEmptyListener", "(Lcom/stripe/android/view/StripeEditText$b;)V", "Lcom/stripe/android/view/StripeEditText$c;", "errorMessageListener", "setErrorMessageListener", "(Lcom/stripe/android/view/StripeEditText$c;)V", "", "errorMessage", "setErrorMessage", "(Ljava/lang/String;)V", "errorColor", "setErrorColor", "Landroid/view/accessibility/AccessibilityNodeInfo;", "info", "onInitializeAccessibilityNodeInfo", "(Landroid/view/accessibility/AccessibilityNodeInfo;)V", "Landroid/os/Parcelable;", "onSaveInstanceState", "()Landroid/os/Parcelable;", "state", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "Landroid/view/View$OnFocusChangeListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnFocusChangeListener", "(Landroid/view/View$OnFocusChangeListener;)V", "getOnFocusChangeListener", "()Landroid/view/View$OnFocusChangeListener;", "kotlin.jvm.PlatformType", "getParentOnFocusChangeListener", "Landroid/text/TextWatcher;", "watcher", "addTextChangedListener", "(Landroid/text/TextWatcher;)V", "removeTextChangedListener", "", "text", "setTextSilent$payments_core_release", "(Ljava/lang/CharSequence;)V", "setTextSilent", "setNumberOnlyInputType", "()V", "f", "k", IntegerTokenConverter.CONVERTER_KEY, "keyCode", "", "g", "(I)Z", "Z", "h", "()Z", "setLastKeyDelete$payments_core_release", "(Z)V", "isLastKeyDelete$payments_core_release$annotations", "isLastKeyDelete", "Lcom/stripe/android/view/StripeEditText$a;", "Lcom/stripe/android/view/StripeEditText$b;", "<set-?>", "j", "Landroid/content/res/ColorStateList;", "getDefaultColorStateList$payments_core_release", "()Landroid/content/res/ColorStateList;", "setDefaultColorStateList$payments_core_release", "defaultColorStateList", "externalColorStateList", "l", "I", "defaultErrorColor", "m", "Ljava/lang/Integer;", "externalErrorColor", "", "n", "Ljava/util/List;", "textWatchers", "shouldShowError", "o", "getShouldShowError", "setShouldShowError", "p", "Ljava/lang/String;", "getErrorMessage$payments_core_release", "()Ljava/lang/String;", "setErrorMessage$payments_core_release", "q", "Lcom/stripe/android/view/StripeEditText$c;", "com/stripe/android/view/StripeEditText$f", "r", "Lcom/stripe/android/view/StripeEditText$f;", "isLastKeyDeleteTextWatcher", "s", "getInternalFocusChangeListeners", "()Ljava/util/List;", "internalFocusChangeListeners", "t", "Landroid/view/View$OnFocusChangeListener;", "externalFocusChangeListener", "u", "getAccessibilityText", "accessibilityText", "getFieldText$payments_core_release", "fieldText", "getDefaultErrorColorInt", "()I", "defaultErrorColorInt", "a", "b", "c", DateTokenConverter.CONVERTER_KEY, "e", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class StripeEditText extends TextInputEditText {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean isLastKeyDelete;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private a afterTextChangedListener;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private b deleteEmptyListener;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private ColorStateList defaultColorStateList;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private ColorStateList externalColorStateList;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int defaultErrorColor;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private Integer externalErrorColor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private List<TextWatcher> textWatchers;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean shouldShowError;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private String errorMessage;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private c errorMessageListener;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final f isLastKeyDeleteTextWatcher;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final List<View.OnFocusChangeListener> internalFocusChangeListeners;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private View.OnFocusChangeListener externalFocusChangeListener;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final String accessibilityText;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/view/StripeEditText$a;", "", "", "text", "Ljn0/h0;", "a", "(Ljava/lang/String;)V", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        void a(String text);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/stripe/android/view/StripeEditText$b;", "", "Ljn0/h0;", "a", "()V", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
        void a();
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/view/StripeEditText$c;", "", "", "message", "Ljn0/h0;", "a", "(Ljava/lang/String;)V", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c {
        void a(String message);
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/view/StripeEditText$d;", "Landroid/view/inputmethod/InputConnectionWrapper;", "Landroid/view/inputmethod/InputConnection;", "target", "", "mutable", "Lcom/stripe/android/view/StripeEditText$b;", "deleteEmptyListener", "<init>", "(Landroid/view/inputmethod/InputConnection;ZLcom/stripe/android/view/StripeEditText$b;)V", "", "beforeLength", "afterLength", "deleteSurroundingText", "(II)Z", "a", "Lcom/stripe/android/view/StripeEditText$b;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class d extends InputConnectionWrapper {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final b deleteEmptyListener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InputConnection target, boolean z11, b bVar) {
            super(target, z11);
            p013kotlin.jvm.internal.s.k(target, "target");
            this.deleteEmptyListener = bVar;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean deleteSurroundingText(int beforeLength, int afterLength) {
            b bVar;
            CharSequence textBeforeCursor = getTextBeforeCursor(1, 0);
            if (textBeforeCursor != null && textBeforeCursor.length() == 0 && (bVar = this.deleteEmptyListener) != null) {
                bVar.a();
            }
            return super.deleteSurroundingText(beforeLength, afterLength);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.view.StripeEditText$e, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\rJ \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001f\u001a\u0004\b\u001d\u0010 ¨\u0006!"}, d2 = {"Lcom/stripe/android/view/StripeEditText$e;", "Landroid/os/Parcelable;", "superState", "", "errorMessage", "", "shouldShowError", "<init>", "(Landroid/os/Parcelable;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Landroid/os/Parcelable;", "c", "()Landroid/os/Parcelable;", "b", "Ljava/lang/String;", "Z", "()Z", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class StripeEditTextState implements Parcelable {
        public static final Parcelable.Creator<StripeEditTextState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Parcelable superState;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String errorMessage;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean shouldShowError;

        /* JADX INFO: renamed from: com.stripe.android.view.StripeEditText$e$a */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<StripeEditTextState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final StripeEditTextState createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new StripeEditTextState(parcel.readParcelable(StripeEditTextState.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final StripeEditTextState[] newArray(int i11) {
                return new StripeEditTextState[i11];
            }
        }

        public StripeEditTextState(Parcelable parcelable, String str, boolean z11) {
            this.superState = parcelable;
            this.errorMessage = str;
            this.shouldShowError = z11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getShouldShowError() {
            return this.shouldShowError;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Parcelable getSuperState() {
            return this.superState;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StripeEditTextState)) {
                return false;
            }
            StripeEditTextState stripeEditTextState = (StripeEditTextState) other;
            return p013kotlin.jvm.internal.s.f(this.superState, stripeEditTextState.superState) && p013kotlin.jvm.internal.s.f(this.errorMessage, stripeEditTextState.errorMessage) && this.shouldShowError == stripeEditTextState.shouldShowError;
        }

        public int hashCode() {
            Parcelable parcelable = this.superState;
            int iHashCode = (parcelable == null ? 0 : parcelable.hashCode()) * 31;
            String str = this.errorMessage;
            return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.shouldShowError);
        }

        public String toString() {
            return "StripeEditTextState(superState=" + this.superState + ", errorMessage=" + this.errorMessage + ", shouldShowError=" + this.shouldShowError + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeParcelable(this.superState, flags);
            parcel.writeString(this.errorMessage);
            parcel.writeInt(this.shouldShowError ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/stripe/android/view/StripeEditText$f", "Lcom/stripe/android/view/v2;", "", "s", "", "start", "before", "count", "Ljn0/h0;", "onTextChanged", "(Ljava/lang/CharSequence;III)V", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f extends v2 {
        f() {
        }

        @Override // com.stripe.android.view.v2, android.text.TextWatcher
        public void onTextChanged(CharSequence s11, int start, int before, int count) {
            StripeEditText.this.setLastKeyDelete$payments_core_release(count == 0);
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\r\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0010\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "Ljn0/h0;", "afterTextChanged", "(Landroid/text/Editable;)V", "", "text", "", "start", "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "core-ktx_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class g implements TextWatcher {
        public g() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s11) {
            a aVar = StripeEditText.this.afterTextChangedListener;
            if (aVar != null) {
                String string = s11 != null ? s11.toString() : null;
                if (string == null) {
                    string = "";
                }
                aVar.a(string);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence text, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence text, int start, int before, int count) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StripeEditText(Context context) {
        this(context, null, 0, 6, null);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    private final void f() {
        this.defaultErrorColor = androidx.core.content.b.getColor(getContext(), s2.INSTANCE.a(this.defaultColorStateList.getDefaultColor()) ? f30.w.f64205i : f30.w.f64204h);
    }

    private final boolean g(int keyCode) {
        return keyCode == 67;
    }

    private final void i() {
        List<TextWatcher> listM = this.textWatchers;
        if (listM == null) {
            listM = p013kotlin.collections.v.m();
        }
        if (!listM.contains(this.isLastKeyDeleteTextWatcher)) {
            addTextChangedListener(this.isLastKeyDeleteTextWatcher);
        }
        setOnKeyListener(new View.OnKeyListener() { // from class: com.stripe.android.view.t2
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i11, KeyEvent keyEvent) {
                return StripeEditText.j(this.f55175a, view, i11, keyEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j(StripeEditText this$0, View view, int i11, KeyEvent keyEvent) {
        b bVar;
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        if (keyEvent.getAction() != 0) {
            return false;
        }
        boolean zG = this$0.g(i11);
        this$0.isLastKeyDelete = zG;
        if (!zG || this$0.length() != 0 || (bVar = this$0.deleteEmptyListener) == null) {
            return false;
        }
        bVar.a();
        return false;
    }

    private final void k() {
        addTextChangedListener(new g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(StripeEditText this$0, View view, boolean z11) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        Iterator<T> it = this$0.internalFocusChangeListeners.iterator();
        while (it.hasNext()) {
            ((View.OnFocusChangeListener) it.next()).onFocusChange(view, z11);
        }
        View.OnFocusChangeListener onFocusChangeListener = this$0.externalFocusChangeListener;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z11);
        }
    }

    @Override // android.widget.TextView
    public void addTextChangedListener(TextWatcher watcher) {
        List<TextWatcher> list;
        super.addTextChangedListener(watcher);
        if (watcher == null || (list = this.textWatchers) == null) {
            return;
        }
        list.add(watcher);
    }

    protected String getAccessibilityText() {
        return this.accessibilityText;
    }

    /* JADX INFO: renamed from: getDefaultColorStateList$payments_core_release, reason: from getter */
    public final ColorStateList getDefaultColorStateList() {
        return this.defaultColorStateList;
    }

    public final int getDefaultErrorColorInt() {
        f();
        return this.defaultErrorColor;
    }

    /* JADX INFO: renamed from: getErrorMessage$payments_core_release, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final String getFieldText$payments_core_release() {
        Editable text = getText();
        String string = text != null ? text.toString() : null;
        return string == null ? "" : string;
    }

    public final List<View.OnFocusChangeListener> getInternalFocusChangeListeners() {
        return this.internalFocusChangeListeners;
    }

    @Override // android.view.View
    public View.OnFocusChangeListener getOnFocusChangeListener() {
        return this.externalFocusChangeListener;
    }

    public final View.OnFocusChangeListener getParentOnFocusChangeListener() {
        return super.getOnFocusChangeListener();
    }

    public final boolean getShouldShowError() {
        return this.shouldShowError;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIsLastKeyDelete() {
        return this.isLastKeyDelete;
    }

    @Override // com.google.android.material.textfield.TextInputEditText, androidx.appcompat.widget.i, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo outAttrs) {
        p013kotlin.jvm.internal.s.k(outAttrs, "outAttrs");
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(outAttrs);
        if (inputConnectionOnCreateInputConnection != null) {
            return new d(inputConnectionOnCreateInputConnection, true, this.deleteEmptyListener);
        }
        return null;
    }

    @Override // com.google.android.material.textfield.TextInputEditText, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        p013kotlin.jvm.internal.s.k(info, "info");
        super.onInitializeAccessibilityNodeInfo(info);
        info.setContentInvalid(this.shouldShowError);
        String accessibilityText = getAccessibilityText();
        if (accessibilityText != null) {
            info.setText(accessibilityText);
        }
        String str = this.errorMessage;
        if (!this.shouldShowError) {
            str = null;
        }
        info.setError(str);
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable state) {
        p013kotlin.jvm.internal.s.i(state, "null cannot be cast to non-null type com.stripe.android.view.StripeEditText.StripeEditTextState");
        StripeEditTextState stripeEditTextState = (StripeEditTextState) state;
        super.onRestoreInstanceState(stripeEditTextState.getSuperState());
        this.errorMessage = stripeEditTextState.getErrorMessage();
        setShouldShowError(stripeEditTextState.getShouldShowError());
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        return new StripeEditTextState(super.onSaveInstanceState(), this.errorMessage, this.shouldShowError);
    }

    @Override // android.widget.TextView
    public void removeTextChangedListener(TextWatcher watcher) {
        List<TextWatcher> list;
        super.removeTextChangedListener(watcher);
        if (watcher == null || (list = this.textWatchers) == null) {
            return;
        }
        list.remove(watcher);
    }

    public final void setAfterTextChangedListener(a afterTextChangedListener) {
        this.afterTextChangedListener = afterTextChangedListener;
    }

    public final void setDefaultColorStateList$payments_core_release(ColorStateList colorStateList) {
        p013kotlin.jvm.internal.s.k(colorStateList, "<set-?>");
        this.defaultColorStateList = colorStateList;
    }

    public final void setDeleteEmptyListener(b deleteEmptyListener) {
        this.deleteEmptyListener = deleteEmptyListener;
    }

    public final void setErrorColor(int errorColor) {
        this.externalErrorColor = Integer.valueOf(errorColor);
    }

    public final void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public final void setErrorMessage$payments_core_release(String str) {
        this.errorMessage = str;
    }

    public final void setErrorMessageListener(c errorMessageListener) {
        this.errorMessageListener = errorMessageListener;
    }

    public final void setLastKeyDelete$payments_core_release(boolean z11) {
        this.isLastKeyDelete = z11;
    }

    public final void setNumberOnlyInputType() {
        Typeface typeface = getTypeface();
        setInputType(18);
        setTypeface(typeface);
        setTransformationMethod(HideReturnsTransformationMethod.getInstance());
    }

    @Override // android.view.View
    public final void setOnFocusChangeListener(View.OnFocusChangeListener listener) {
        super.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.u2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                StripeEditText.l(this.f55182a, view, z11);
            }
        });
        this.externalFocusChangeListener = listener;
    }

    public final void setShouldShowError(boolean z11) {
        c cVar;
        String str = this.errorMessage;
        if (str != null && (cVar = this.errorMessageListener) != null) {
            if (!z11) {
                str = null;
            }
            cVar.a(str);
        }
        if (this.shouldShowError != z11) {
            if (z11) {
                Integer num = this.externalErrorColor;
                super.setTextColor(num != null ? num.intValue() : this.defaultErrorColor);
            } else {
                ColorStateList colorStateList = this.externalColorStateList;
                if (colorStateList == null) {
                    colorStateList = this.defaultColorStateList;
                }
                super.setTextColor(colorStateList);
            }
            refreshDrawableState();
        }
        this.shouldShowError = z11;
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colors) {
        super.setTextColor(colors);
        this.externalColorStateList = getTextColors();
    }

    public final void setTextSilent$payments_core_release(CharSequence text) {
        List<TextWatcher> list = this.textWatchers;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                super.removeTextChangedListener((TextWatcher) it.next());
            }
        }
        setText(text);
        List<TextWatcher> list2 = this.textWatchers;
        if (list2 != null) {
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                super.addTextChangedListener((TextWatcher) it2.next());
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StripeEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    public /* synthetic */ StripeEditText(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? i.a.E : i11);
    }

    @Override // android.widget.TextView
    public void setTextColor(int color) {
        setTextColor(ColorStateList.valueOf(color));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripeEditText(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        p013kotlin.jvm.internal.s.k(context, "context");
        this.isLastKeyDeleteTextWatcher = new f();
        this.textWatchers = new ArrayList();
        setMaxLines(1);
        k();
        i();
        ColorStateList textColors = getTextColors();
        p013kotlin.jvm.internal.s.j(textColors, "getTextColors(...)");
        this.defaultColorStateList = textColors;
        f();
        setOnFocusChangeListener(null);
        this.internalFocusChangeListeners = new ArrayList();
    }
}
