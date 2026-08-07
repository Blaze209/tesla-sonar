package ak0;

import ch.qos.logback.core.CoreConstants;
import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.io.CannotParseException;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.Impp;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes8.dex */
public class w extends g1<Impp> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final List<a> f1749d;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Pattern f1750a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f1751b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f1752c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f1753d;

        public a(String str) {
            this(str, "(.*)", 1, "%s");
        }

        public a(String str, String str2, int i11, String str3) {
            this.f1750a = Pattern.compile('^' + str + CoreConstants.COLON_CHAR + str2, 2);
            this.f1751b = str;
            this.f1752c = i11;
            this.f1753d = str + CoreConstants.COLON_CHAR + str3;
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a("aim", "(goim|addbuddy)\\?.*?\\bscreenname=(.*?)(&|$)", 2, "goim?screenname=%s"));
        arrayList.add(new a("ymsgr", "(sendim|addfriend|sendfile|call)\\?(.*)", 2, "sendim?%s"));
        arrayList.add(new a("skype", "(.*?)(\\?|$)", 1, "%s"));
        arrayList.add(new a("msnim", "(chat|add|voice|video)\\?contact=(.*?)(&|$)", 2, "chat?contact=%s"));
        arrayList.add(new a("xmpp", "(.*?)(\\?|$)", 1, "%s?message"));
        arrayList.add(new a("icq", "message\\?uin=(\\d+)", 1, "message?uin=%s"));
        arrayList.add(new a("sip"));
        arrayList.add(new a("irc"));
        f1749d = Collections.unmodifiableList(arrayList);
    }

    public w() {
        super(Impp.class, "IMPP");
    }

    private Impp j(String str) {
        if (str == null || str.length() == 0) {
            return new Impp((URI) null);
        }
        try {
            return new Impp(str);
        } catch (IllegalArgumentException e11) {
            throw new CannotParseException(15, str, e11.getMessage());
        }
    }

    @Override // ak0.g1
    protected VCardDataType a(VCardVersion vCardVersion) {
        return VCardDataType.f63495f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ak0.g1
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Impp b(String str, VCardDataType vCardDataType, VCardParameters vCardParameters, yj0.a aVar) {
        return j(gq.e.f(str));
    }
}
