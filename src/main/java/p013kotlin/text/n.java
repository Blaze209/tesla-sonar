package p013kotlin.text;

import bo0.j;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ho0.l;
import java.util.Iterator;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import p013kotlin.Metadata;
import p013kotlin.collections.d;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0012\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\f\u0010\u0011R\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u001dR\u0014\u0010!\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\"¨\u0006$"}, d2 = {"Lkotlin/text/n;", "Lkotlin/text/m;", "Ljava/util/regex/Matcher;", "matcher", "", "input", "<init>", "(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V", "next", "()Lkotlin/text/m;", "a", "Ljava/util/regex/Matcher;", "b", "Ljava/lang/CharSequence;", "Lkotlin/text/l;", "c", "Lkotlin/text/l;", "()Lkotlin/text/l;", "groups", "", "", DateTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "groupValues_", "Ljava/util/regex/MatchResult;", "f", "()Ljava/util/regex/MatchResult;", "matchResult", "Lbo0/j;", "()Lbo0/j;", "range", "getValue", "()Ljava/lang/String;", "value", "()Ljava/util/List;", "groupValues", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class n implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Matcher matcher;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final CharSequence input;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final l groups;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private List<String> groupValues_;

    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"kotlin/text/n$a", "Lkotlin/collections/d;", "", "", "index", "get", "(I)Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()I", "size", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends d<String> {
        a() {
        }

        @Override // p013kotlin.collections.b, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof String) {
                return contains((String) obj);
            }
            return false;
        }

        @Override // p013kotlin.collections.b
        /* JADX INFO: renamed from: d */
        public int getSize() {
            return n.this.f().groupCount() + 1;
        }

        public /* bridge */ int h(String str) {
            return super.indexOf(str);
        }

        public /* bridge */ int i(String str) {
            return super.lastIndexOf(str);
        }

        @Override // p013kotlin.collections.d, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof String) {
                return h((String) obj);
            }
            return -1;
        }

        @Override // p013kotlin.collections.d, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return i((String) obj);
            }
            return -1;
        }

        public /* bridge */ boolean contains(String str) {
            return super.contains((Object) str);
        }

        @Override // p013kotlin.collections.d, java.util.List
        public String get(int index) {
            String strGroup = n.this.f().group(index);
            return strGroup == null ? "" : strGroup;
        }
    }

    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"kotlin/text/n$b", "", "Lkotlin/collections/b;", "Lkotlin/text/k;", "", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "", "index", "get", "(I)Lkotlin/text/k;", DateTokenConverter.CONVERTER_KEY, "()I", "size", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends p013kotlin.collections.b<MatchGroup> implements l {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final MatchGroup j(b bVar, int i11) {
            return bVar.get(i11);
        }

        @Override // p013kotlin.collections.b, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null ? true : obj instanceof MatchGroup) {
                return i((MatchGroup) obj);
            }
            return false;
        }

        @Override // p013kotlin.collections.b
        /* JADX INFO: renamed from: d */
        public int getSize() {
            return n.this.f().groupCount() + 1;
        }

        @Override // p013kotlin.text.l
        public MatchGroup get(int index) {
            j jVarI = r.i(n.this.f(), index);
            if (jVarI.getStart().intValue() < 0) {
                return null;
            }
            String strGroup = n.this.f().group(index);
            s.j(strGroup, "group(...)");
            return new MatchGroup(strGroup, jVarI);
        }

        public /* bridge */ boolean i(MatchGroup matchGroup) {
            return super.contains(matchGroup);
        }

        @Override // p013kotlin.collections.b, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<MatchGroup> iterator() {
            return l.U(v.e0(v.n(this)), new wn0.l() { // from class: kotlin.text.o
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return n.b.j(this.f89190a, ((Integer) obj).intValue());
                }
            }).iterator();
        }
    }

    public n(Matcher matcher, CharSequence input) {
        s.k(matcher, "matcher");
        s.k(input, "input");
        this.matcher = matcher;
        this.input = input;
        this.groups = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MatchResult f() {
        return this.matcher;
    }

    @Override // p013kotlin.text.m
    public m.b a() {
        return m.a.a(this);
    }

    @Override // p013kotlin.text.m
    /* JADX INFO: renamed from: b, reason: from getter */
    public l getGroups() {
        return this.groups;
    }

    @Override // p013kotlin.text.m
    public List<String> c() {
        if (this.groupValues_ == null) {
            this.groupValues_ = new a();
        }
        List<String> list = this.groupValues_;
        s.h(list);
        return list;
    }

    @Override // p013kotlin.text.m
    public j d() {
        return r.h(f());
    }

    @Override // p013kotlin.text.m
    public String getValue() {
        String strGroup = f().group();
        s.j(strGroup, "group(...)");
        return strGroup;
    }

    @Override // p013kotlin.text.m
    public m next() {
        int iEnd = f().end() + (f().end() == f().start() ? 1 : 0);
        if (iEnd > this.input.length()) {
            return null;
        }
        Matcher matcher = this.matcher.pattern().matcher(this.input);
        s.j(matcher, "matcher(...)");
        return r.f(matcher, iEnd, this.input);
    }
}
