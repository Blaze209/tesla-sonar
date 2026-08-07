package ak0;

import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.VCardProperty;
import java.util.Date;
import javax.xml.namespace.QName;

/* JADX INFO: loaded from: classes8.dex */
public abstract class g1<T extends VCardProperty> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Class<T> f1737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final String f1738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final QName f1739c;

    public g1(Class<T> cls, String str) {
        this(cls, str, new QName(VCardVersion.V4_0.getXmlNamespace(), str.toLowerCase()));
    }

    protected static Date c(String str) {
        return ezvcard.util.i.parse(str);
    }

    protected abstract VCardDataType a(VCardVersion vCardVersion);

    protected abstract T b(String str, VCardDataType vCardDataType, VCardParameters vCardParameters, yj0.a aVar);

    public final VCardDataType d(VCardVersion vCardVersion) {
        return a(vCardVersion);
    }

    public Class<T> e() {
        return this.f1737a;
    }

    public String f() {
        return this.f1738b;
    }

    public QName g() {
        return this.f1739c;
    }

    public final T h(String str, VCardDataType vCardDataType, VCardParameters vCardParameters, yj0.a aVar) {
        T t11 = (T) b(str, vCardDataType, vCardParameters, aVar);
        t11.setParameters(vCardParameters);
        return t11;
    }

    public g1(Class<T> cls, String str, QName qName) {
        this.f1737a = cls;
        this.f1738b = str;
        this.f1739c = qName;
    }
}
