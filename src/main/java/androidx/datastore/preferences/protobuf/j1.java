package androidx.datastore.preferences.protobuf;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes.dex */
final class j1 {

    class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f8141a;

        a(g gVar) {
            this.f8141a = gVar;
        }

        @Override // androidx.datastore.preferences.protobuf.j1.b
        public byte byteAt(int i11) {
            return this.f8141a.b(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.j1.b
        public int size() {
            return this.f8141a.size();
        }
    }

    private interface b {
        byte byteAt(int i11);

        int size();
    }

    static String a(g gVar) {
        return b(new a(gVar));
    }

    static String b(b bVar) {
        StringBuilder sb2 = new StringBuilder(bVar.size());
        for (int i11 = 0; i11 < bVar.size(); i11++) {
            byte bByteAt = bVar.byteAt(i11);
            if (bByteAt == 34) {
                sb2.append("\\\"");
            } else if (bByteAt == 39) {
                sb2.append("\\'");
            } else if (bByteAt != 92) {
                switch (bByteAt) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (bByteAt < 32 || bByteAt > 126) {
                            sb2.append(CoreConstants.ESCAPE_CHAR);
                            sb2.append((char) (((bByteAt >>> 6) & 3) + 48));
                            sb2.append((char) (((bByteAt >>> 3) & 7) + 48));
                            sb2.append((char) ((bByteAt & 7) + 48));
                        } else {
                            sb2.append((char) bByteAt);
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    static String c(String str) {
        return a(g.h(str));
    }
}
