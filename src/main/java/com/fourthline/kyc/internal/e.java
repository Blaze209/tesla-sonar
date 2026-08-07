package com.fourthline.kyc.internal;

import ch.qos.logback.classic.net.SyslogAppender;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f24427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final LinkedHashMap f24428c;

    public e(String nodeName) {
        s.k(nodeName, "nodeName");
        this.f24426a = nodeName;
        this.f24427b = new ArrayList();
        this.f24428c = new LinkedHashMap();
    }

    public final boolean a(String str) {
        s.k(str, "<this>");
        return this.f24427b.add(new h(str));
    }

    public String toString() throws IOException {
        StringBuilder sb2 = new StringBuilder();
        a(sb2, "");
        String string = sb2.toString();
        s.j(string, "toString(...)");
        return t.F1(string).toString();
    }

    public final e a(String str, Pair[] attributes, wn0.l init) {
        s.k(str, "<this>");
        s.k(attributes, "attributes");
        s.k(init, "init");
        e eVar = new e(str);
        init.invoke(eVar);
        a((Pair[]) Arrays.copyOf(attributes, attributes.length));
        this.f24427b.add(eVar);
        return eVar;
    }

    public final void a(String name, Object value) {
        s.k(name, "name");
        s.k(value, "value");
        this.f24428c.put(name, value.toString());
    }

    @Override // com.fourthline.kyc.internal.a
    public void a(Appendable builder, String indent) throws IOException {
        s.k(builder, "builder");
        s.k(indent, "indent");
        String strLineSeparator = System.lineSeparator();
        builder.append(indent + "<" + this.f24426a + a());
        if (this.f24427b.isEmpty()) {
            builder.append("/>" + strLineSeparator);
            return;
        }
        if (this.f24427b.size() == 1 && (this.f24427b.get(0) instanceof h)) {
            builder.append(">");
            Object obj = this.f24427b.get(0);
            s.i(obj, "null cannot be cast to non-null type com.fourthline.kyc.zipper.internal.xml.TextElement");
            ((h) obj).a(builder);
            builder.append("</" + this.f24426a + ">" + strLineSeparator);
            return;
        }
        builder.append(">" + strLineSeparator);
        Iterator it = this.f24427b.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(builder, indent + SyslogAppender.DEFAULT_STACKTRACE_PATTERN);
        }
        builder.append(indent + "</" + this.f24426a + ">" + strLineSeparator);
    }

    private final String a() {
        if (this.f24428c.isEmpty()) {
            return "";
        }
        Set setEntrySet = this.f24428c.entrySet();
        s.j(setEntrySet, "<get-entries>(...)");
        return " " + v.y0(setEntrySet, " ", null, null, 0, null, new wn0.l() { // from class: op.a
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.fourthline.kyc.internal.e.a((Map.Entry) obj);
            }
        }, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence a(Map.Entry it) {
        s.k(it, "it");
        return it.getKey() + "=\"" + b.a(it.getValue().toString()) + "\"";
    }

    private final void a(Pair... pairArr) {
        for (Pair pair : pairArr) {
            a((String) pair.e(), pair.f());
        }
    }
}
