package oy;

import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.Dynamic;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public class g extends l<Locale> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f100077b;

    public g() {
        super(e());
        this.f100077b = d();
    }

    private static String d() {
        return Locale.getDefault().toLanguageTag().replace(CoreConstants.DASH_CHAR, '_');
    }

    private static Locale e() {
        return com.henninghall.date_picker.h.f(d());
    }

    public String f() {
        return this.f100077b;
    }

    @Override // oy.l
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Locale c(Dynamic dynamic) {
        String strReplace = dynamic.asString().replace(CoreConstants.DASH_CHAR, '_');
        this.f100077b = strReplace;
        return com.henninghall.date_picker.h.f(strReplace);
    }
}
