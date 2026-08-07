package sn0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.io.AccessDeniedException;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0011\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001d\u0019\u001bBm\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\u001a\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011B\u001b\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0012J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0017\u001a\u00020\u00002\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\"\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\"\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR(\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lsn0/f;", "Lho0/i;", "Ljava/io/File;", "start", "Lsn0/g;", "direction", "Lkotlin/Function1;", "", "onEnter", "Ljn0/h0;", "onLeave", "Lkotlin/Function2;", "Ljava/io/IOException;", "onFail", "", "maxDepth", "<init>", "(Ljava/io/File;Lsn0/g;Lwn0/l;Lwn0/l;Lwn0/p;I)V", "(Ljava/io/File;Lsn0/g;)V", "", "iterator", "()Ljava/util/Iterator;", "function", "h", "(Lwn0/p;)Lsn0/f;", "a", "Ljava/io/File;", "b", "Lsn0/g;", "c", "Lwn0/l;", DateTokenConverter.CONVERTER_KEY, "e", "Lwn0/p;", "f", "I", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f implements ho0.i<File> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final File start;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g direction;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<File, Boolean> onEnter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<File, h0> onLeave;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final wn0.p<File, IOException, h0> onFail;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int maxDepth;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\"\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lsn0/f$a;", "Lsn0/f$c;", "Ljava/io/File;", "rootDir", "<init>", "(Ljava/io/File;)V", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static abstract class a extends c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(File rootDir) {
            super(rootDir);
            s.k(rootDir, "rootDir");
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0013\u0010\fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0082\u0010¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lsn0/f$b;", "Lkotlin/collections/c;", "Ljava/io/File;", "<init>", "(Lsn0/f;)V", "root", "Lsn0/f$a;", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/io/File;)Lsn0/f$a;", "j", "()Ljava/io/File;", "Ljn0/h0;", "b", "()V", "Ljava/util/ArrayDeque;", "Lsn0/f$c;", "c", "Ljava/util/ArrayDeque;", "state", "a", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class b extends p013kotlin.collections.c<File> {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final ArrayDeque<c> state;

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\tR\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\t¨\u0006\u0015"}, d2 = {"Lsn0/f$b$a;", "Lsn0/f$a;", "Ljava/io/File;", "rootDir", "<init>", "(Lsn0/f$b;Ljava/io/File;)V", "b", "()Ljava/io/File;", "", "Z", "rootVisited", "", "c", "[Ljava/io/File;", "fileList", "", DateTokenConverter.CONVERTER_KEY, "I", "fileIndex", "e", "failed", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
        private final class a extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private boolean rootVisited;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private File[] fileList;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
            private int fileIndex;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
            private boolean failed;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ b f111466f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, File rootDir) {
                super(rootDir);
                s.k(rootDir, "rootDir");
                this.f111466f = bVar;
            }

            @Override // sn0.f.c
            public File b() {
                if (!this.failed && this.fileList == null) {
                    wn0.l lVar = f.this.onEnter;
                    if (lVar != null && !((Boolean) lVar.invoke(getRoot())).booleanValue()) {
                        return null;
                    }
                    File[] fileArrListFiles = getRoot().listFiles();
                    this.fileList = fileArrListFiles;
                    if (fileArrListFiles == null) {
                        wn0.p pVar = f.this.onFail;
                        if (pVar != null) {
                            pVar.invoke(getRoot(), new AccessDeniedException(getRoot(), null, "Cannot list files in a directory", 2, null));
                        }
                        this.failed = true;
                    }
                }
                File[] fileArr = this.fileList;
                if (fileArr != null) {
                    int i11 = this.fileIndex;
                    s.h(fileArr);
                    if (i11 < fileArr.length) {
                        File[] fileArr2 = this.fileList;
                        s.h(fileArr2);
                        int i12 = this.fileIndex;
                        this.fileIndex = i12 + 1;
                        return fileArr2[i12];
                    }
                }
                if (!this.rootVisited) {
                    this.rootVisited = true;
                    return getRoot();
                }
                wn0.l lVar2 = f.this.onLeave;
                if (lVar2 != null) {
                    lVar2.invoke(getRoot());
                }
                return null;
            }
        }

        /* JADX INFO: renamed from: sn0.f$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\t¨\u0006\u000b"}, d2 = {"Lsn0/f$b$b;", "Lsn0/f$c;", "Ljava/io/File;", "rootFile", "<init>", "(Lsn0/f$b;Ljava/io/File;)V", "b", "()Ljava/io/File;", "", "Z", "visited", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
        private final class C2380b extends c {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private boolean visited;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f111468c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2380b(b bVar, File rootFile) {
                super(rootFile);
                s.k(rootFile, "rootFile");
                this.f111468c = bVar;
            }

            @Override // sn0.f.c
            public File b() {
                if (this.visited) {
                    return null;
                }
                this.visited = true;
                return getRoot();
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\tR\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lsn0/f$b$c;", "Lsn0/f$a;", "Ljava/io/File;", "rootDir", "<init>", "(Lsn0/f$b;Ljava/io/File;)V", "b", "()Ljava/io/File;", "", "Z", "rootVisited", "", "c", "[Ljava/io/File;", "fileList", "", DateTokenConverter.CONVERTER_KEY, "I", "fileIndex", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
        private final class c extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private boolean rootVisited;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private File[] fileList;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
            private int fileIndex;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ b f111472e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(b bVar, File rootDir) {
                super(rootDir);
                s.k(rootDir, "rootDir");
                this.f111472e = bVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:30:0x007e, code lost:
            
                if (r0.length == 0) goto L31;
             */
            @Override // sn0.f.c
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.io.File b() {
                /*
                    r9 = this;
                    boolean r0 = r9.rootVisited
                    r1 = 0
                    if (r0 != 0) goto L28
                    sn0.f$b r0 = r9.f111472e
                    sn0.f r0 = sn0.f.this
                    wn0.l r0 = sn0.f.d(r0)
                    if (r0 == 0) goto L20
                    java.io.File r2 = r9.getRoot()
                    java.lang.Object r0 = r0.invoke(r2)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L20
                    return r1
                L20:
                    r0 = 1
                    r9.rootVisited = r0
                    java.io.File r0 = r9.getRoot()
                    return r0
                L28:
                    java.io.File[] r0 = r9.fileList
                    if (r0 == 0) goto L47
                    int r2 = r9.fileIndex
                    p013kotlin.jvm.internal.s.h(r0)
                    int r0 = r0.length
                    if (r2 >= r0) goto L35
                    goto L47
                L35:
                    sn0.f$b r0 = r9.f111472e
                    sn0.f r0 = sn0.f.this
                    wn0.l r0 = sn0.f.f(r0)
                    if (r0 == 0) goto L46
                    java.io.File r2 = r9.getRoot()
                    r0.invoke(r2)
                L46:
                    return r1
                L47:
                    java.io.File[] r0 = r9.fileList
                    if (r0 != 0) goto L92
                    java.io.File r0 = r9.getRoot()
                    java.io.File[] r0 = r0.listFiles()
                    r9.fileList = r0
                    if (r0 != 0) goto L76
                    sn0.f$b r0 = r9.f111472e
                    sn0.f r0 = sn0.f.this
                    wn0.p r0 = sn0.f.e(r0)
                    if (r0 == 0) goto L76
                    java.io.File r2 = r9.getRoot()
                    kotlin.io.AccessDeniedException r3 = new kotlin.io.AccessDeniedException
                    java.io.File r4 = r9.getRoot()
                    r7 = 2
                    r8 = 0
                    r5 = 0
                    java.lang.String r6 = "Cannot list files in a directory"
                    r3.<init>(r4, r5, r6, r7, r8)
                    r0.invoke(r2, r3)
                L76:
                    java.io.File[] r0 = r9.fileList
                    if (r0 == 0) goto L80
                    p013kotlin.jvm.internal.s.h(r0)
                    int r0 = r0.length
                    if (r0 != 0) goto L92
                L80:
                    sn0.f$b r0 = r9.f111472e
                    sn0.f r0 = sn0.f.this
                    wn0.l r0 = sn0.f.f(r0)
                    if (r0 == 0) goto L91
                    java.io.File r2 = r9.getRoot()
                    r0.invoke(r2)
                L91:
                    return r1
                L92:
                    java.io.File[] r0 = r9.fileList
                    p013kotlin.jvm.internal.s.h(r0)
                    int r1 = r9.fileIndex
                    int r2 = r1 + 1
                    r9.fileIndex = r2
                    r0 = r0[r1]
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: sn0.f.b.c.b():java.io.File");
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f111473a;

            static {
                int[] iArr = new int[g.values().length];
                try {
                    iArr[g.TOP_DOWN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[g.BOTTOM_UP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f111473a = iArr;
            }
        }

        public b() {
            ArrayDeque<c> arrayDeque = new ArrayDeque<>();
            this.state = arrayDeque;
            if (f.this.start.isDirectory()) {
                arrayDeque.push(i(f.this.start));
            } else if (f.this.start.isFile()) {
                arrayDeque.push(new C2380b(this, f.this.start));
            } else {
                d();
            }
        }

        private final a i(File root) {
            int i11 = d.f111473a[f.this.direction.ordinal()];
            if (i11 == 1) {
                return new c(this, root);
            }
            if (i11 == 2) {
                return new a(this, root);
            }
            throw new NoWhenBranchMatchedException();
        }

        private final File j() {
            while (true) {
                c cVarPeek = this.state.peek();
                if (cVarPeek == null) {
                    return null;
                }
                File fileB = cVarPeek.b();
                if (fileB == null) {
                    this.state.pop();
                } else {
                    if (s.f(fileB, cVarPeek.getRoot()) || !fileB.isDirectory() || this.state.size() >= f.this.maxDepth) {
                        return fileB;
                    }
                    this.state.push(i(fileB));
                }
            }
        }

        @Override // p013kotlin.collections.c
        protected void b() {
            File fileJ = j();
            if (fileJ != null) {
                e(fileJ);
            } else {
                d();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\"\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\u0007¨\u0006\n"}, d2 = {"Lsn0/f$c;", "", "Ljava/io/File;", "root", "<init>", "(Ljava/io/File;)V", "b", "()Ljava/io/File;", "a", "Ljava/io/File;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final File root;

        public c(File root) {
            s.k(root, "root");
            this.root = root;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final File getRoot() {
            return this.root;
        }

        public abstract File b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private f(File file, g gVar, wn0.l<? super File, Boolean> lVar, wn0.l<? super File, h0> lVar2, wn0.p<? super File, ? super IOException, h0> pVar, int i11) {
        this.start = file;
        this.direction = gVar;
        this.onEnter = lVar;
        this.onLeave = lVar2;
        this.onFail = pVar;
        this.maxDepth = i11;
    }

    public final f h(wn0.p<? super File, ? super IOException, h0> function) {
        s.k(function, "function");
        return new f(this.start, this.direction, this.onEnter, this.onLeave, function, this.maxDepth);
    }

    @Override // ho0.i
    public Iterator<File> iterator() {
        return new b();
    }

    /* synthetic */ f(File file, g gVar, wn0.l lVar, wn0.l lVar2, wn0.p pVar, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i12 & 2) != 0 ? g.TOP_DOWN : gVar, lVar, lVar2, pVar, (i12 & 32) != 0 ? Integer.MAX_VALUE : i11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(File start, g direction) {
        this(start, direction, null, null, null, 0, 32, null);
        s.k(start, "start");
        s.k(direction, "direction");
    }
}
