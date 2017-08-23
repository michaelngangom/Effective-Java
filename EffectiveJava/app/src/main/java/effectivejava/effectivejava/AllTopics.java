package effectivejava.effectivejava;

/**
 * Created by michaelngangom on 8/22/17.
 */

public class AllTopics {

    private String topic;
    private int topicNumber;

    public void setTopicNumber(int topicNumber) {
        this.topicNumber = topicNumber;
    }

    public String getTopic() {
        return topic;


    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    private AllTopics(int topicNumber, String topic) {
        this.topic = topic;
        this.topicNumber = topicNumber;
    }

    @Override
    public String toString() {
        return this.topic;
    }

    public static final AllTopics[] topicsCAndD = {new AllTopics(1, "Consider static factory instead of constructions"),
            new AllTopics(2, "Consider a builder when faced with many constructors parameters"),
            new AllTopics(3, "Enforce the singleton property with a private constructor or an enum type"),
            new AllTopics(4, "Enforce noninstantiability with a private constructor"),
            new AllTopics(5, "Avoid creating unnecessary objects"),
            new AllTopics(6, "Eliminate obsolete object references"),
            new AllTopics(7, "Avoid finalizers")};


    public static final AllTopics[] topicsMCAO={
            new AllTopics(8, "Obey the general contract when overriding equals"),
            new AllTopics(9, "Always override hashCode when you\n" +
                    "override equals"),
            new AllTopics(10, "Always override toString"),
            new AllTopics(11, "Override clone judiciously"),
            new AllTopics(12, "Consider implementing Comparable")};

    public static final AllTopics[] topicsClassAndInterfaces={
            new AllTopics(13, "Minimize the accessibility of classes and members"),
            new AllTopics(14, "In public classes, use accessor methods,\n" +
                    "not public fields"),
            new AllTopics(15, "Minimize mutability"),
            new AllTopics(16, "Favor composition over inheritance"),
            new AllTopics(17, "Design and document for inheritance or else prohibit it"),
            new AllTopics(18, "Prefer interfaces to abstract classes"),
            new AllTopics(19, "Use interfaces only to define types"),
            new AllTopics(20, "Prefer class hierarchies to tagged classes"),
            new AllTopics(21, "Use function objects to represent strategies")};

    public static final AllTopics[] topicsGenerics={
            new AllTopics(22, "Favor static member classes over nonstatic"),
            new AllTopics(23, "Don’t use raw types in new code"),
            new AllTopics(24, "Eliminate unchecked warnings"),
            new AllTopics(25, "Prefer lists to arrays"),
            new AllTopics(26, "Favor generic types"),
            new AllTopics(27, "Favor generic methods"),
            new AllTopics(28, "Use bounded wildcards to increase API flexibility"),
            new AllTopics(29, "Consider typesafe heterogeneous containers")};

    public static final AllTopics[] topicsEnumsAndAnnotations={
            new AllTopics(30, "Use enums instead of int constants"),
            new AllTopics(31, "Use instance fields instead of ordinals"),
            new AllTopics(32, "Use EnumSet instead of bit fields"),
            new AllTopics(33, "Use EnumMap instead of ordinal indexing"),
            new AllTopics(34, "Emulate extensible enums with interfaces"),
            new AllTopics(35, "Prefer annotations to naming patterns"),
            new AllTopics(36, "Consistently use the Override annotation"),
            new AllTopics(37, "Use marker interfaces to define types")};

    public static final AllTopics[] topicsMethods={
            new AllTopics(38, "Check parameters for validity"),
            new AllTopics(39, "Make defensive copies when needed"),
            new AllTopics(40, "Design method signatures carefully"),
            new AllTopics(41, "Use overloading judiciously"),
            new AllTopics(42, "Use varargs judiciously"),
            new AllTopics(43, "Return empty arrays or collections, not nulls"),
            new AllTopics(44, "Write doc comments for all exposed API elements")};

    public static final AllTopics[] topicsGeneralProgrammin={
            new AllTopics(45, "Minimize the scope of local variables"),
            new AllTopics(46, "Prefer for-each loops to traditional for loops"),
            new AllTopics(47, "Know and use the libraries"),
            new AllTopics(48, "Avoid float and double if exact answers\n" +
                    "are required ."),
            new AllTopics(49, "Prefer primitive types to boxed primitives"),
            new AllTopics(50, "Avoid strings where other types are more appropriate"),
            new AllTopics(51, "Beware the performance of string concatenation"),
            new AllTopics(52, "Refer to objects by their interfaces"),
            new AllTopics(53, "Prefer interfaces to reflection"),
            new AllTopics(54, "Use native methods judiciously"),
            new AllTopics(55, "Use native methods judiciously"),
            new AllTopics(56, "Adhere to generally accepted naming conventions")};


    public static final AllTopics[] topicsExceptions={
            new AllTopics(57, "Use exceptions only for exceptional conditions"),
            new AllTopics(58, "Use checked exceptions for recoverable conditions\n" +
                    "and runtime exceptions for programming errors"),
            new AllTopics(59, "Avoid unnecessary use of checked exceptions"),
            new AllTopics(60, "Favor the use of standard exceptions"),
            new AllTopics(61, "Throw exceptions appropriate to the abstraction"),
            new AllTopics(62, "Document all exceptions thrown by each method"),
            new AllTopics(63, "Include failure-capture information in\n" +
                    "detail messages"),
            new AllTopics(64, "Strive for failure atomicity"),
            new AllTopics(65, "Don’t ignore exceptions")};


    public static final AllTopics[] topicsConcurrency={
            new AllTopics(66, "Synchronize access to shared mutable data"),
            new AllTopics(67, "Avoid excessive synchronization"),
            new AllTopics(68, "Prefer executors and tasks to threads"),
            new AllTopics(69, "Prefer concurrency utilities to wait and notify"),
            new AllTopics(70, "Document thread safety"),
            new AllTopics(71, "Use lazy initialization judiciously"),
            new AllTopics(72, "Don’t depend on the thread scheduler"),
            new AllTopics(73, "Avoid thread groups")};

    public static final AllTopics[] topicsSerializations={
            new AllTopics(74, "Implement Serializable judiciously"),
            new AllTopics(75, "Consider using a custom serialized form"),
            new AllTopics(76, "Write readObject methods defensively"),
            new AllTopics(77, "For instance control, prefer enum types\n" +
                    "to readResolve"),
            new AllTopics(78, "Consider serialization proxies instead of serialized\n" +
                    "instances")};


    }

