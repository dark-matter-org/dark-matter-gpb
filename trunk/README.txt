Project ordering:

dark-matter-gpb depends on the following projects:

dark-matter-concinnity
dark-matter-data
dark-matter-templates

However, dark-matter-data uses the dark-matter-templates JAR.

So, in the Java Build path order, you should ensure that dark-matter-tmemplates
comes before dark-matter-data, or you'll be picking up the version from the JAR
not from the project linkage.