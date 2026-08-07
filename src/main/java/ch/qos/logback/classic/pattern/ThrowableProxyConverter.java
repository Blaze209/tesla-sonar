package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.classic.spi.IThrowableProxy;
import ch.qos.logback.classic.spi.StackTraceElementProxy;
import ch.qos.logback.classic.spi.ThrowableProxyUtil;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.boolex.EvaluationException;
import ch.qos.logback.core.boolex.EventEvaluator;
import ch.qos.logback.core.status.ErrorStatus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class ThrowableProxyConverter extends ThrowableHandlingConverter {
    protected static final int BUILDER_CAPACITY = 2048;
    int lengthOption;
    List<EventEvaluator<ILoggingEvent>> evaluatorList = null;
    List<String> ignoredStackTraceLines = null;
    int errorCount = 0;

    private void addEvaluator(EventEvaluator<ILoggingEvent> eventEvaluator) {
        if (this.evaluatorList == null) {
            this.evaluatorList = new ArrayList();
        }
        this.evaluatorList.add(eventEvaluator);
    }

    private void addIgnoreStackTraceLine(String str) {
        if (this.ignoredStackTraceLines == null) {
            this.ignoredStackTraceLines = new ArrayList();
        }
        this.ignoredStackTraceLines.add(str);
    }

    private boolean isIgnoredStackTraceLine(String str) {
        List<String> list = this.ignoredStackTraceLines;
        if (list == null) {
            return false;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (str.contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    private void printIgnoredCount(StringBuilder sb2, int i11) {
        sb2.append(" [");
        sb2.append(i11);
        sb2.append(" skipped]");
    }

    private void printStackLine(StringBuilder sb2, int i11, StackTraceElementProxy stackTraceElementProxy) {
        sb2.append(stackTraceElementProxy);
        extraData(sb2, stackTraceElementProxy);
        if (i11 > 0) {
            printIgnoredCount(sb2, i11);
        }
    }

    private void recursiveAppend(StringBuilder sb2, String str, int i11, IThrowableProxy iThrowableProxy) {
        if (iThrowableProxy == null) {
            return;
        }
        subjoinFirstLine(sb2, str, i11, iThrowableProxy);
        sb2.append(CoreConstants.LINE_SEPARATOR);
        subjoinSTEPArray(sb2, i11, iThrowableProxy);
        IThrowableProxy[] suppressed = iThrowableProxy.getSuppressed();
        if (suppressed != null) {
            for (IThrowableProxy iThrowableProxy2 : suppressed) {
                recursiveAppend(sb2, CoreConstants.SUPPRESSED, i11 + 1, iThrowableProxy2);
            }
        }
        recursiveAppend(sb2, CoreConstants.CAUSED_BY, i11, iThrowableProxy.getCause());
    }

    private void subjoinExceptionMessage(StringBuilder sb2, IThrowableProxy iThrowableProxy) {
        sb2.append(iThrowableProxy.getClassName());
        sb2.append(": ");
        sb2.append(iThrowableProxy.getMessage());
    }

    private void subjoinFirstLine(StringBuilder sb2, String str, int i11, IThrowableProxy iThrowableProxy) {
        ThrowableProxyUtil.indent(sb2, i11 - 1);
        if (str != null) {
            sb2.append(str);
        }
        subjoinExceptionMessage(sb2, iThrowableProxy);
    }

    @Override // ch.qos.logback.core.pattern.Converter
    public String convert(ILoggingEvent iLoggingEvent) {
        IThrowableProxy throwableProxy = iLoggingEvent.getThrowableProxy();
        if (throwableProxy == null) {
            return "";
        }
        if (this.evaluatorList != null) {
            for (int i11 = 0; i11 < this.evaluatorList.size(); i11++) {
                EventEvaluator<ILoggingEvent> eventEvaluator = this.evaluatorList.get(i11);
                try {
                    if (eventEvaluator.evaluate(iLoggingEvent)) {
                        return "";
                    }
                } catch (EvaluationException e11) {
                    this.errorCount++;
                    if (this.errorCount < 4) {
                        addError("Exception thrown for evaluator named [" + eventEvaluator.getName() + "]", e11);
                    } else if (this.errorCount == 4) {
                        ErrorStatus errorStatus = new ErrorStatus("Exception thrown for evaluator named [" + eventEvaluator.getName() + "].", this, e11);
                        errorStatus.add(new ErrorStatus("This was the last warning about this evaluator's errors.We don't want the StatusManager to get flooded.", this));
                        addStatus(errorStatus);
                    }
                }
            }
        }
        return throwableProxyToString(throwableProxy);
    }

    protected void extraData(StringBuilder sb2, StackTraceElementProxy stackTraceElementProxy) {
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000a  */
    @Override // ch.qos.logback.core.pattern.DynamicConverter, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        String firstOption = getFirstOption();
        if (firstOption == null) {
            this.lengthOption = Integer.MAX_VALUE;
        } else {
            String lowerCase = firstOption.toLowerCase(Locale.US);
            if ("full".equals(lowerCase)) {
                this.lengthOption = Integer.MAX_VALUE;
            } else if ("short".equals(lowerCase)) {
                this.lengthOption = 1;
            } else {
                try {
                    this.lengthOption = Integer.parseInt(lowerCase);
                } catch (NumberFormatException unused) {
                    addError("Could not parse [" + lowerCase + "] as an integer");
                    this.lengthOption = Integer.MAX_VALUE;
                }
            }
        }
        List<String> optionList = getOptionList();
        if (optionList != null && optionList.size() > 1) {
            int size = optionList.size();
            for (int i11 = 1; i11 < size; i11++) {
                String str = optionList.get(i11);
                EventEvaluator<ILoggingEvent> eventEvaluator = (EventEvaluator) ((Map) getContext().getObject(CoreConstants.EVALUATOR_MAP)).get(str);
                if (eventEvaluator != null) {
                    addEvaluator(eventEvaluator);
                } else {
                    addIgnoreStackTraceLine(str);
                }
            }
        }
        super.start();
    }

    @Override // ch.qos.logback.core.pattern.DynamicConverter, ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        this.evaluatorList = null;
        super.stop();
    }

    protected void subjoinSTEPArray(StringBuilder sb2, int i11, IThrowableProxy iThrowableProxy) {
        StackTraceElementProxy[] stackTraceElementProxyArray = iThrowableProxy.getStackTraceElementProxyArray();
        int commonFrames = iThrowableProxy.getCommonFrames();
        int length = this.lengthOption;
        boolean z11 = length > stackTraceElementProxyArray.length;
        if (z11) {
            length = stackTraceElementProxyArray.length;
        }
        if (commonFrames > 0 && z11) {
            length -= commonFrames;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            StackTraceElementProxy stackTraceElementProxy = stackTraceElementProxyArray[i13];
            if (isIgnoredStackTraceLine(stackTraceElementProxy.toString())) {
                i12++;
                if (length < stackTraceElementProxyArray.length) {
                    length++;
                }
            } else {
                ThrowableProxyUtil.indent(sb2, i11);
                printStackLine(sb2, i12, stackTraceElementProxy);
                sb2.append(CoreConstants.LINE_SEPARATOR);
                i12 = 0;
            }
        }
        if (i12 > 0) {
            printIgnoredCount(sb2, i12);
            sb2.append(CoreConstants.LINE_SEPARATOR);
        }
        if (commonFrames <= 0 || !z11) {
            return;
        }
        ThrowableProxyUtil.indent(sb2, i11);
        sb2.append("... ");
        sb2.append(iThrowableProxy.getCommonFrames());
        sb2.append(" common frames omitted");
        sb2.append(CoreConstants.LINE_SEPARATOR);
    }

    protected String throwableProxyToString(IThrowableProxy iThrowableProxy) {
        StringBuilder sb2 = new StringBuilder(2048);
        recursiveAppend(sb2, null, 1, iThrowableProxy);
        return sb2.toString();
    }
}
