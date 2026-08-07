package freemarker.core;

import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import freemarker.template.utility.NullArgumentException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Properties;
import java.util.TimeZone;
import lk0.r;

/* JADX INFO: loaded from: classes8.dex */
public class Configurable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String[] f66408w = {"api_builtin_enabled", "arithmetic_engine", "auto_flush", "boolean_format", "classic_compatible", "date_format", "datetime_format", "locale", "log_template_exceptions", "new_builtin_class_resolver", "number_format", "object_wrapper", "output_encoding", "show_error_tips", "sql_date_and_time_time_zone", "strict_bean_models", "template_exception_handler", "time_format", "time_zone", "url_escaping_charset"};

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String[] f66409x = {"apiBuiltinEnabled", "arithmeticEngine", "autoFlush", "booleanFormat", "classicCompatible", "dateFormat", "datetimeFormat", "locale", "logTemplateExceptions", "newBuiltinClassResolver", "numberFormat", "objectWrapper", "outputEncoding", "showErrorTips", "sqlDateAndTimeTimeZone", "strictBeanModels", "templateExceptionHandler", "timeFormat", "timeZone", "urlEscapingCharset"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Configurable f66410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Properties f66411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HashMap f66412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Locale f66413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f66414e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f66415f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f66416g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f66417h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private TimeZone f66418i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private TimeZone f66419j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f66420k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f66421l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f66422m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Integer f66423n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private lk0.o f66424o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private a f66425p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private lk0.g f66426q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Boolean f66427r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private j f66428s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Boolean f66429t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Boolean f66430u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Boolean f66431v;

    public static class SettingValueAssignmentException extends _MiscTemplateException {
    }

    public static class UnknownSettingException extends _MiscTemplateException {
    }

    public Configurable() {
        this(lk0.a.H);
    }

    public void a(String str) {
        NullArgumentException.a("booleanFormat", str);
        int iIndexOf = str.indexOf(44);
        if (iIndexOf == -1) {
            throw new IllegalArgumentException("Setting value must be string that contains two comma-separated values for true and false, respectively.");
        }
        this.f66420k = str;
        this.f66411b.setProperty("boolean_format", str);
        if (str.equals("true,false")) {
            this.f66421l = null;
            this.f66422m = null;
        } else {
            this.f66421l = str.substring(0, iIndexOf);
            this.f66422m = str.substring(iIndexOf + 1);
        }
    }

    protected Object clone() {
        Configurable configurable = (Configurable) super.clone();
        configurable.f66411b = new Properties(this.f66411b);
        configurable.f66412c = (HashMap) this.f66412c.clone();
        return configurable;
    }

    protected Configurable(lk0.q qVar) {
        r.a(qVar);
        this.f66410a = null;
        this.f66411b = new Properties();
        Locale locale = Locale.getDefault();
        this.f66413d = locale;
        this.f66411b.setProperty("locale", locale.toString());
        TimeZone timeZone = TimeZone.getDefault();
        this.f66418i = timeZone;
        this.f66411b.setProperty("time_zone", timeZone.getID());
        this.f66419j = null;
        this.f66411b.setProperty("sql_date_and_time_time_zone", String.valueOf((Object) null));
        this.f66414e = InquiryField.FloatField.TYPE2;
        this.f66411b.setProperty("number_format", InquiryField.FloatField.TYPE2);
        this.f66415f = "";
        this.f66411b.setProperty("time_format", "");
        this.f66416g = "";
        this.f66411b.setProperty("date_format", "");
        this.f66417h = "";
        this.f66411b.setProperty("datetime_format", "");
        Integer num = new Integer(0);
        this.f66423n = num;
        this.f66411b.setProperty("classic_compatible", num.toString());
        lk0.o oVarC = r.c(qVar);
        this.f66424o = oVarC;
        this.f66411b.setProperty("template_exception_handler", oVarC.getClass().getName());
        a.C1352a c1352a = a.f66469d;
        this.f66425p = c1352a;
        this.f66411b.setProperty("arithmetic_engine", c1352a.getClass().getName());
        this.f66426q = lk0.a.d(qVar);
        Boolean bool = Boolean.TRUE;
        this.f66427r = bool;
        this.f66411b.setProperty("auto_flush", bool.toString());
        j jVar = j.f66492a;
        this.f66428s = jVar;
        this.f66411b.setProperty("new_builtin_class_resolver", jVar.getClass().getName());
        this.f66429t = bool;
        this.f66411b.setProperty("show_error_tips", bool.toString());
        Boolean bool2 = Boolean.FALSE;
        this.f66430u = bool2;
        this.f66411b.setProperty("api_builtin_enabled", bool2.toString());
        Boolean boolValueOf = Boolean.valueOf(r.b(qVar));
        this.f66431v = boolValueOf;
        this.f66411b.setProperty("log_template_exceptions", boolValueOf.toString());
        a("true,false");
        this.f66412c = new HashMap();
    }
}
