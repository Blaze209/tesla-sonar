package ezvcard.parameter;

import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.util.GeoUri;
import ezvcard.util.g;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public class VCardParameters extends g<String, String> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<String, Set<VCardVersion>> f63613b;

    class a extends d<ezvcard.parameter.c> {
        a(String str) {
            super(str);
        }

        @Override // ezvcard.parameter.VCardParameters.d
        protected IllegalStateException _exception(String str, Exception exc) {
            return new IllegalStateException(xj0.b.INSTANCE.getExceptionMessage(15, "PID"), exc);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ezvcard.parameter.VCardParameters.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ezvcard.parameter.c _asObject(String str) {
            return ezvcard.parameter.c.a(str);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ezvcard.parameter.VCardParameters.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String _asString(ezvcard.parameter.c cVar) {
            return cVar.toString();
        }
    }

    public abstract class b<T extends VCardParameter> extends d<T> {
        public b(String str) {
            super(str);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ezvcard.parameter.VCardParameters.d
        public String _asString(T t11) {
            return t11.b();
        }
    }

    public abstract class c<T extends VCardParameter> extends b<T> {
        public c() {
            super("TYPE");
        }
    }

    public abstract class d<T> extends AbstractList<T> {
        protected final String parameterName;
        protected final List<String> parameterValues;

        public d(String str) {
            this.parameterName = str;
            this.parameterValues = VCardParameters.this.e(str);
        }

        private T asObject(String str) {
            try {
                return _asObject(str);
            } catch (Exception e11) {
                throw _exception(str, e11);
            }
        }

        protected abstract T _asObject(String str);

        protected abstract String _asString(T t11);

        protected IllegalStateException _exception(String str, Exception exc) {
            return new IllegalStateException(xj0.b.INSTANCE.getExceptionMessage(26, this.parameterName), exc);
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i11, T t11) {
            this.parameterValues.add(i11, _asString(t11));
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int i11) {
            return asObject(this.parameterValues.get(i11));
        }

        @Override // java.util.AbstractList, java.util.List
        public T remove(int i11) {
            return asObject(this.parameterValues.remove(i11));
        }

        @Override // java.util.AbstractList, java.util.List
        public T set(int i11, T t11) {
            return asObject(this.parameterValues.set(i11, _asString(t11)));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.parameterValues.size();
        }
    }

    static {
        HashMap map = new HashMap();
        VCardVersion vCardVersion = VCardVersion.V4_0;
        map.put("ALTID", EnumSet.of(vCardVersion));
        map.put("CALSCALE", EnumSet.of(vCardVersion));
        map.put("CHARSET", EnumSet.of(VCardVersion.V2_1));
        map.put("GEO", EnumSet.of(vCardVersion));
        map.put("INDEX", EnumSet.of(vCardVersion));
        map.put("LEVEL", EnumSet.of(vCardVersion));
        map.put("MEDIATYPE", EnumSet.of(vCardVersion));
        map.put("PID", EnumSet.of(vCardVersion));
        map.put("SORT-AS", EnumSet.of(vCardVersion));
        map.put("TZ", EnumSet.of(vCardVersion));
        f63613b = Collections.unmodifiableMap(map);
    }

    public VCardParameters() {
    }

    private static boolean C(String str) {
        boolean z11 = false;
        for (int i11 = 0; i11 < str.length(); i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt == '.') {
                if (i11 == 0 || i11 == str.length() - 1 || z11) {
                    return false;
                }
                z11 = true;
            } else if (cCharAt < '0' || cCharAt > '9') {
                return false;
            }
        }
        return true;
    }

    public List<String> A() {
        return e("TYPE");
    }

    public VCardDataType B() {
        String strD = d("VALUE");
        if (strD == null) {
            return null;
        }
        return VCardDataType.d(strD);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ezvcard.util.g
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public String j(String str) {
        if (str == null) {
            return null;
        }
        return str.toUpperCase();
    }

    public void E(String str) {
        i("ALTID", str);
    }

    public void F(Calscale calscale) {
        i("CALSCALE", calscale == null ? null : calscale.b());
    }

    public void G(GeoUri geoUri) {
        i("GEO", geoUri == null ? null : geoUri.toString());
    }

    public void H(Integer num) {
        i("INDEX", num == null ? null : num.toString());
    }

    public void I(String str) {
        i("LABEL", str);
    }

    public void J(String str) {
        i("LANGUAGE", str);
    }

    public void K(String str) {
        i("LEVEL", str);
    }

    public void L(String str) {
        i("MEDIATYPE", str);
    }

    public void M(Integer num) {
        i("PREF", num == null ? null : num.toString());
    }

    public void N(String... strArr) {
        h("SORT-AS");
        g("SORT-AS", Arrays.asList(strArr));
    }

    public void O(String str) {
        i("TZ", str);
    }

    public void P(String str) {
        i("TYPE", str);
    }

    public void Q(VCardDataType vCardDataType) {
        i("VALUE", vCardDataType == null ? null : vCardDataType.e());
    }

    public List<xj0.d> R(VCardVersion vCardVersion) {
        ArrayList arrayList = new ArrayList(0);
        eq.a syntaxStyle = vCardVersion.getSyntaxStyle();
        for (Map.Entry<String, List<String>> entry : this) {
            String key = entry.getKey();
            if (vCardVersion == VCardVersion.V4_0 || !"LABEL".equalsIgnoreCase(key)) {
                if (!hq.b.d(key, syntaxStyle, true)) {
                    if (syntaxStyle == eq.a.OLD) {
                        arrayList.add(new xj0.d(30, key, hq.b.b(syntaxStyle, true).d().e(true)));
                    } else {
                        arrayList.add(new xj0.d(26, key));
                    }
                }
                Iterator<String> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    if ("LABEL".equalsIgnoreCase(key)) {
                        next = next.replaceAll("\r\n|\r|\n", "");
                    }
                    if (!hq.b.e(next, syntaxStyle, false, true)) {
                        arrayList.add(new xj0.d(syntaxStyle == eq.a.OLD ? 31 : 25, key, next, hq.b.c(syntaxStyle, false, true).d().e(true)));
                    }
                }
            }
        }
        String strD = d("CALSCALE");
        if (strD != null && Calscale.e(strD) == null) {
            arrayList.add(new xj0.d(3, "CALSCALE", strD, Calscale.d()));
        }
        String strD2 = d("ENCODING");
        if (strD2 != null) {
            ezvcard.parameter.a aVarE = ezvcard.parameter.a.e(strD2);
            if (aVarE == null) {
                arrayList.add(new xj0.d(3, "ENCODING", strD2, ezvcard.parameter.a.d()));
            } else if (!aVarE.c(vCardVersion)) {
                arrayList.add(new xj0.d(4, "ENCODING", strD2));
            }
        }
        String strD3 = d("VALUE");
        if (strD3 != null) {
            VCardDataType vCardDataTypeC = VCardDataType.c(strD3);
            if (vCardDataTypeC == null) {
                arrayList.add(new xj0.d(3, "VALUE", strD3, VCardDataType.b()));
            } else if (!vCardDataTypeC.g(vCardVersion)) {
                arrayList.add(new xj0.d(4, "VALUE", strD3));
            }
        }
        try {
            p();
        } catch (IllegalStateException unused) {
            arrayList.add(new xj0.d(5, "GEO", d("GEO")));
        }
        try {
            Integer numQ = q();
            if (numQ != null && numQ.intValue() <= 0) {
                arrayList.add(new xj0.d(28, numQ));
            }
        } catch (IllegalStateException unused2) {
            arrayList.add(new xj0.d(5, "INDEX", d("INDEX")));
        }
        for (String str : e("PID")) {
            if (!C(str)) {
                arrayList.add(new xj0.d(27, str));
            }
        }
        try {
            Integer numW = w();
            if (numW != null && (numW.intValue() < 1 || numW.intValue() > 100)) {
                arrayList.add(new xj0.d(29, numW));
            }
        } catch (IllegalStateException unused3) {
            arrayList.add(new xj0.d(5, "PREF", d("PREF")));
        }
        for (Map.Entry<String, Set<VCardVersion>> entry2 : f63613b.entrySet()) {
            String key2 = entry2.getKey();
            if (d(key2) != null && !entry2.getValue().contains(vCardVersion)) {
                arrayList.add(new xj0.d(6, key2));
            }
        }
        String strN = n();
        if (strN != null) {
            try {
                Charset.forName(strN);
            } catch (IllegalCharsetNameException unused4) {
                arrayList.add(new xj0.d(22, strN));
            } catch (UnsupportedCharsetException unused5) {
                arrayList.add(new xj0.d(22, strN));
            }
        }
        return arrayList;
    }

    @Override // ezvcard.util.g
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VCardParameters vCardParameters = (VCardParameters) obj;
        if (size() != vCardParameters.size()) {
            return false;
        }
        for (Map.Entry<String, List<String>> entry : this) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            List<String> listE = vCardParameters.e(key);
            if (value.size() != listE.size()) {
                return false;
            }
            ArrayList arrayList = new ArrayList(value.size());
            Iterator<String> it = value.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().toLowerCase());
            }
            Collections.sort(arrayList);
            ArrayList arrayList2 = new ArrayList(listE.size());
            Iterator<String> it2 = listE.iterator();
            while (it2.hasNext()) {
                arrayList2.add(it2.next().toLowerCase());
            }
            Collections.sort(arrayList2);
            if (!arrayList.equals(arrayList2)) {
                return false;
            }
        }
        return true;
    }

    @Override // ezvcard.util.g
    public int hashCode() {
        int i11 = 1;
        for (Map.Entry<String, List<String>> entry : this) {
            String key = entry.getKey();
            Iterator<String> it = entry.getValue().iterator();
            int iHashCode = 1;
            while (it.hasNext()) {
                iHashCode += it.next().toLowerCase().hashCode();
            }
            int iHashCode2 = (key == null ? 0 : key.toLowerCase().hashCode()) + 32;
            i11 += iHashCode2 + (iHashCode2 * 31) + iHashCode;
        }
        return i11;
    }

    public String l() {
        return d("ALTID");
    }

    public Calscale m() {
        String strD = d("CALSCALE");
        if (strD == null) {
            return null;
        }
        return Calscale.f(strD);
    }

    public String n() {
        return d("CHARSET");
    }

    public ezvcard.parameter.a o() {
        String strD = d("ENCODING");
        if (strD == null) {
            return null;
        }
        return ezvcard.parameter.a.f(strD);
    }

    public GeoUri p() {
        String strD = d("GEO");
        if (strD == null) {
            return null;
        }
        try {
            return GeoUri.n(strD);
        } catch (IllegalArgumentException e11) {
            throw new IllegalStateException(xj0.b.INSTANCE.getExceptionMessage(15, "GEO"), e11);
        }
    }

    public Integer q() {
        String strD = d("INDEX");
        if (strD == null) {
            return null;
        }
        try {
            return Integer.valueOf(strD);
        } catch (NumberFormatException e11) {
            throw new IllegalStateException(xj0.b.INSTANCE.getExceptionMessage(15, "INDEX"), e11);
        }
    }

    public String r() {
        return d("LABEL");
    }

    public String s() {
        return d("LANGUAGE");
    }

    public String t() {
        return d("LEVEL");
    }

    public String u() {
        return d("MEDIATYPE");
    }

    public List<ezvcard.parameter.c> v() {
        return new a("PID");
    }

    public Integer w() {
        String strD = d("PREF");
        if (strD == null) {
            return null;
        }
        try {
            return Integer.valueOf(strD);
        } catch (NumberFormatException e11) {
            throw new IllegalStateException(xj0.b.INSTANCE.getExceptionMessage(15, "PREF"), e11);
        }
    }

    public List<String> x() {
        return e("SORT-AS");
    }

    public String y() {
        return d("TZ");
    }

    public String z() {
        return d("TYPE");
    }

    public VCardParameters(VCardParameters vCardParameters) {
        super(vCardParameters);
    }

    public VCardParameters(Map<String, List<String>> map) {
        super(map);
    }
}
