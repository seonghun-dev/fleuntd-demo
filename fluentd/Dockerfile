FROM fluent/fluentd:edge-debian
LABEL authors="seonghun"

USER root

RUN gem install fluent-plugin-s3

COPY conf/fluent.conf /fluentd/etc/fluent.conf

USER fluent