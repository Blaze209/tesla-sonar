package pq0;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes10.dex */
public class k extends uq0.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Pattern[][] f103688e = {new Pattern[]{null, null}, new Pattern[]{Pattern.compile("^<(?:script|pre|style)(?:\\s|>|$)", 2), Pattern.compile("</(?:script|pre|style)>", 2)}, new Pattern[]{Pattern.compile("^<!--"), Pattern.compile("-->")}, new Pattern[]{Pattern.compile("^<[?]"), Pattern.compile("\\?>")}, new Pattern[]{Pattern.compile("^<![A-Z]"), Pattern.compile(">")}, new Pattern[]{Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>")}, new Pattern[]{Pattern.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|section|source|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, new Pattern[]{Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$", 2), null}};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sq0.j f103689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Pattern f103690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f103691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private pq0.a f103692d;

    public static class b extends uq0.b {
        @Override // uq0.e
        public uq0.f a(uq0.h hVar, uq0.g gVar) {
            int iC = hVar.c();
            CharSequence charSequenceA = hVar.a();
            if (hVar.O() < 4 && charSequenceA.charAt(iC) == '<') {
                for (int i11 = 1; i11 <= 7; i11++) {
                    if (i11 != 7 || !(gVar.a().c() instanceof sq0.t)) {
                        Pattern pattern = k.f103688e[i11][0];
                        Pattern pattern2 = k.f103688e[i11][1];
                        if (pattern.matcher(charSequenceA.subSequence(iC, charSequenceA.length())).find()) {
                            return uq0.f.d(new k(pattern2)).b(hVar.getIndex());
                        }
                    }
                }
            }
            return uq0.f.c();
        }
    }

    @Override // uq0.d
    public sq0.a c() {
        return this.f103689a;
    }

    @Override // uq0.a, uq0.d
    public void d(CharSequence charSequence) {
        this.f103692d.a(charSequence);
        Pattern pattern = this.f103690b;
        if (pattern == null || !pattern.matcher(charSequence).find()) {
            return;
        }
        this.f103691c = true;
    }

    @Override // uq0.d
    public uq0.c e(uq0.h hVar) {
        if (this.f103691c) {
            return uq0.c.d();
        }
        return (hVar.b() && this.f103690b == null) ? uq0.c.d() : uq0.c.b(hVar.getIndex());
    }

    @Override // uq0.a, uq0.d
    public void g() {
        this.f103689a.n(this.f103692d.b());
        this.f103692d = null;
    }

    private k(Pattern pattern) {
        this.f103689a = new sq0.j();
        this.f103691c = false;
        this.f103692d = new pq0.a();
        this.f103690b = pattern;
    }
}
