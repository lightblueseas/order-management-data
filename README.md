# order-management-data

Parent project that holds module projects for the persistence of order management data.

The project holds backend data for simple order and invoice management.

## License

The source code comes under the liberal MIT License.

# Build status
[![Build Status](https://travis-ci.org/lightblueseas/order-management-data.svg?branch=master)](https://travis-ci.org/lightblueseas/order-management-data)

## Maven Central

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/de.alpharogroup/order-management-data/badge.svg)](https://maven-badges.herokuapp.com/maven-central/de.alpharogroup/order-management-data)

## Maven dependency

Maven dependency is now on sonatype.
Check out [sonatype repository](https://oss.sonatype.org/index.html#nexus-search;gav~de.alpharogroup~order-management-data~~~) for latest snapshots and releases.

Add the following maven dependencies to your project `pom.xml` if you want to import the core functionality:

You can first define the version properties:

	<properties>
			...
		<!-- order-management-data version -->
		<order-management-data.version>3.11.0</order-management-data.version>
		<order-management-entities.version>${order-management-data.version}</order-management-entities.version>
			...
	</properties>

Add the following maven dependency to your project `pom.xml` if you want to import the functionality of order-management-entities:

		<dependencies>
			...
			<dependency>
				<groupId>de.alpharogroup</groupId>
				<artifactId>order-management-entities</artifactId>
				<version>${order-management-entities.version}</version>
			</dependency>
			...
		</dependencies>

## Want to Help and improve it? ###

The source code for order-management-data are on GitHub. Please feel free to fork and send pull requests!

Create your own fork of [lightblueseas/order-management-data/fork](https://github.com/lightblueseas/order-management-data/fork)

To share your changes, [submit a pull request](https://github.com/lightblueseas/order-management-data/pull/new/master).

Don't forget to add new units tests on your changes.

## Contacting the Developer

Do not hesitate to contact the order-management-data developers with your questions, concerns, comments, bug reports, or feature requests.
- Feature requests, questions and bug reports can be reported at the [issues page](https://github.com/lightblueseas/order-management-data/issues).

## Note

No animals were harmed in the making of this library.

# Donate

If you like this library, please consider a donation through 
<a href="https://flattr.com/submit/auto?fid=r7vp62&url=https%3A%2F%2Fgithub.com%2Flightblueseas%2Forder-management-data" target="_blank">
<img src="http://button.flattr.com/flattr-badge-large.png" alt="Flattr this" title="Flattr this" border="0">
</a>
