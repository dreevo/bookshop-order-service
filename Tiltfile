# Build
custom_build(
     # Name of the container image
     ref = 'bookshop-order-service',
     tag = 'latest',
     # Command to build the container image
     command = './gradlew bootBuildImage --imageName bookshop-order-service:latest',
     # Files to watch that trigger a new build
     deps = ['build.gradle', 'src']
)
# Deploy
k8s_yaml(['k8s/deployment.yml', 'k8s/service.yml'])
# Manage
k8s_resource('bookshop-order-service', port_forwards=['9002'])