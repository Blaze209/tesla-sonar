package po0;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlinx.datetime.internal.format.parser.ParseException;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import po0.c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081@\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0003:\u0001\u0006B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\r\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e\u0088\u0001\u0005\u0092\u0001\b\u0012\u0004\u0012\u00028\u00000\u0004¨\u0006\u000f"}, d2 = {"Lpo0/k;", "Lpo0/c;", "Output", "", "Lpo0/p;", "commands", "a", "(Lpo0/p;)Lpo0/p;", "", "input", "initialContainer", "", "startIndex", "b", "(Lpo0/p;Ljava/lang/CharSequence;Lpo0/c;I)Lpo0/c;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@vn0.b
public final class k<Output extends c<Output>> {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B%\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\n\u0010\u0012¨\u0006\u0013"}, d2 = {"Lpo0/k$a;", "Output", "", "output", "Lpo0/p;", "parserStructure", "", "inputPosition", "<init>", "(Ljava/lang/Object;Lpo0/p;I)V", "a", "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "Lpo0/p;", "c", "()Lpo0/p;", "I", "()I", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a<Output> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Output output;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final p<Output> parserStructure;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int inputPosition;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Output output, p<? super Output> parserStructure, int i11) {
            p013kotlin.jvm.internal.s.k(parserStructure, "parserStructure");
            this.output = output;
            this.parserStructure = parserStructure;
            this.inputPosition = i11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getInputPosition() {
            return this.inputPosition;
        }

        public final Output b() {
            return this.output;
        }

        public final p<Output> c() {
            return this.parserStructure;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return mn0.a.d(Integer.valueOf(((i) t12).getPosition()), Integer.valueOf(((i) t11).getPosition()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <Output extends c<Output>> p<Output> a(p<? super Output> commands) {
        p013kotlin.jvm.internal.s.k(commands, "commands");
        return commands;
    }

    public static final Output b(p<? super Output> pVar, CharSequence input, Output initialContainer, int i11) throws ParseException {
        p013kotlin.jvm.internal.s.k(input, "input");
        p013kotlin.jvm.internal.s.k(initialContainer, "initialContainer");
        ArrayList arrayList = new ArrayList();
        List listS = v.s(new a(initialContainer, pVar, i11));
        while (true) {
            a aVar = (a) v.P(listS);
            if (aVar != null) {
                Output output = (Output) ((c) aVar.b()).copy();
                int inputPosition = aVar.getInputPosition();
                p pVarC = aVar.c();
                int size = pVarC.b().size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size) {
                        if (!pVarC.a().isEmpty()) {
                            int size2 = pVarC.a().size() - 1;
                            if (size2 < 0) {
                                break;
                            }
                            while (true) {
                                int i13 = size2 - 1;
                                listS.add(new a(output, (p) pVarC.a().get(size2), inputPosition));
                                if (i13 < 0) {
                                    break;
                                }
                                size2 = i13;
                            }
                        } else {
                            if (inputPosition != input.length()) {
                                arrayList.add(new i(inputPosition, l.f103504c));
                                break;
                            }
                            return output;
                        }
                    } else {
                        Object objA = ((n) pVarC.b().get(i12)).a(output, input, inputPosition);
                        if (!(objA instanceof Integer)) {
                            if (objA instanceof i) {
                                arrayList.add((i) objA);
                                break;
                            }
                            throw new IllegalStateException(("Unexpected parse result: " + objA).toString());
                        }
                        inputPosition = ((Number) objA).intValue();
                        i12++;
                    }
                }
            } else {
                if (arrayList.size() > 1) {
                    v.C(arrayList, new b());
                }
                throw new ParseException(arrayList);
            }
        }
    }

    public static /* synthetic */ c c(p pVar, CharSequence charSequence, c cVar, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        return b(pVar, charSequence, cVar, i11);
    }
}
