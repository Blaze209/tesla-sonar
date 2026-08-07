package com.adyen.checkout.ui.core.internal.ui.view;

import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import me.a;
import me.b;
import org.webrtc.WebrtcBuildVersion;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.q;
import p013kotlin.text.t;
import re.d;
import se.ExpiryDate;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 #2\u00020\u0001:\u0001$B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR$\u0010\"\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006%"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/view/ExpiryDateInput;", "Lcom/adyen/checkout/ui/core/internal/ui/view/AdyenTextInputEditText;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ljava/util/Calendar;", "calendar", "Ljn0/h0;", "e", "(Ljava/util/Calendar;)V", "", "s", "", "f", "(Ljava/lang/String;)Z", "Landroid/text/Editable;", "editable", "c", "(Landroid/text/Editable;)V", "Ljava/text/SimpleDateFormat;", IntegerTokenConverter.CONVERTER_KEY, "Ljava/text/SimpleDateFormat;", "dateFormat", "Lse/a;", "expiryDate", "getDate", "()Lse/a;", "setDate", "(Lse/a;)V", InquiryField.DateField.TYPE, "j", "a", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ExpiryDateInput extends AdyenTextInputEditText {

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final SimpleDateFormat dateFormat;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExpiryDateInput(Context context) {
        this(context, null, 0, 6, null);
        s.k(context, "context");
    }

    private final void e(Calendar calendar) {
        if (calendar.get(1) / 100 < Calendar.getInstance().get(1) / 100) {
            calendar.add(1, 100);
        }
    }

    private final boolean f(String s11) {
        try {
            Integer.parseInt(s11);
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.view.AdyenTextInputEditText
    public void c(Editable editable) {
        s.k(editable, "editable");
        String string = editable.toString();
        String strJ = new q("(\\d{2})(?=\\d)").j(new q("\\D").j(string, ""), "$1/");
        if (strJ.length() == 1 && f(strJ) && Integer.parseInt(strJ) > 1) {
            strJ = WebrtcBuildVersion.maint_version + strJ;
        }
        if (!s.f(string, strJ)) {
            editable.replace(0, string.length(), strJ);
        }
        super.c(editable);
    }

    public final ExpiryDate getDate() {
        String strA = d.a(getRawValue(), new char[0]);
        a aVar = a.VERBOSE;
        b.Companion companion = b.INSTANCE;
        if (companion.a().a(aVar)) {
            String name = ExpiryDateInput.class.getName();
            s.h(name);
            String strU1 = t.u1(t.y1(name, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
            if (strU1.length() != 0) {
                name = t.W0(strU1, "Kt");
            }
            b bVarA = companion.a();
            bVarA.b(aVar, "CO." + name, "getDate - " + strA, null);
        }
        try {
            Date date = this.dateFormat.parse(strA);
            if (date == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            s.h(calendar);
            e(calendar);
            return new ExpiryDate(calendar.get(2) + 1, calendar.get(1));
        } catch (ParseException e11) {
            a aVar2 = a.DEBUG;
            b.Companion companion2 = b.INSTANCE;
            if (companion2.a().a(aVar2)) {
                String name2 = ExpiryDateInput.class.getName();
                s.h(name2);
                String strU2 = t.u1(t.y1(name2, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
                if (strU2.length() != 0) {
                    name2 = t.W0(strU2, "Kt");
                }
                companion2.a().b(aVar2, "CO." + name2, "getDate - value does not match expected pattern. ", e11);
            }
            return getRawValue().length() == 0 ? qe.a.f105353a : qe.a.f105354b;
        }
    }

    public final void setDate(ExpiryDate expiryDate) {
        s.k(expiryDate, "expiryDate");
        if (expiryDate == qe.a.f105353a) {
            setText("");
            return;
        }
        a aVar = a.VERBOSE;
        b.Companion companion = b.INSTANCE;
        if (companion.a().a(aVar)) {
            String name = ExpiryDateInput.class.getName();
            s.h(name);
            String strU1 = t.u1(t.y1(name, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
            if (strU1.length() != 0) {
                name = t.W0(strU1, "Kt");
            }
            b bVarA = companion.a();
            bVarA.b(aVar, "CO." + name, "setDate - " + expiryDate.getExpiryYear() + " " + expiryDate.getExpiryMonth(), null);
        }
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(expiryDate.getExpiryYear(), expiryDate.getExpiryMonth() - 1, 1);
        setText(this.dateFormat.format(calendar.getTime()));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExpiryDateInput(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        s.k(context, "context");
    }

    public /* synthetic */ ExpiryDateInput(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpiryDateInput(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        s.k(context, "context");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/yy", Locale.ROOT);
        this.dateFormat = simpleDateFormat;
        d(5);
        simpleDateFormat.setLenient(false);
    }
}
