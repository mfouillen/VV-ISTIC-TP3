# Mocks to the rescue

The classes `SSLSocket`, `TLSProtocol` and `TLSSocketFactory` are included in the `sockets` package of the [`tp3-ssl`](../code/tp3-ssl) project.

The test class `TLSSocketFactoryTest` tests `TLSSocketFactory` and manually builds stubs and mocks for SSLSocket objects.

Rewrite these tests with the help of Mockito.

The initial tests fail to completely test the `TLSSockeetFactory`. In fact, if we *entirely* remove the code inside the body of `prepareSocket` no test case fails.

Propose a solution to this problem in your new Mockito-based test cases.

## Answer
Tests wrote with the help of Mockito is available [here](/code/tp3-ssl/src/test/java/fr/istic/vv/TLSSocketFactoryTestMocks.java).


If we *entirely* remove the code inside the body of `prepareSocket`, the test case `typical` does not fail.
This test case check that `setEnabledProtocols` has been called, and that has been called with wanted paremeters.
