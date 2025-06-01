 Project Title: Patient Management System
📄 Project Description:
The Patient Management System is a microservices-based healthcare platform developed using Spring Boot, designed to manage patient records, appointments, billing, and analytics efficiently. It leverages modern technologies such as Apache Kafka, gRPC, and PostgreSQL to enable high-performance communication, data consistency, and scalability.

⚙️ Key Technologies Used:
Spring Boot: Core framework to build modular microservices.

REST API: Exposes public endpoints for interaction with frontend and external systems.

gRPC: Enables fast and efficient inter-service communication, especially between services like Patient and Billing.

Apache Kafka: Handles asynchronous communication and event streaming between services (e.g., patient registration events, billing updates).

PostgreSQL: Each microservice uses a dedicated PostgreSQL database for data persistence.

Docker + LocalStack: Simulates AWS services locally for deployment and testing.

AWS CDK (Infrastructure as Code): Manages cloud infrastructure programmatically.

🧩 Microservices Overview:
Auth Service

Manages user authentication and JWT token generation

Exposes REST APIs

Stores user credentials in a PostgreSQL database

Patient Service

Manages patient registration, health records, and appointment history

Uses REST API for client access

Communicates with the Billing Service via gRPC

Publishes patient events to Kafka for downstream analytics

Billing Service

Handles invoice creation, payment tracking, and insurance processing

Exposes gRPC endpoints

Subscribes to Kafka events for billing triggers

Analytics Service

Consumes Kafka topics to generate real-time insights

Tracks trends like patient load, revenue, and service usage

API Gateway

Central access point for all REST endpoints

Performs routing and load balancing

💾 Database Design:
Each service has its own PostgreSQL instance:

auth-service-db

patient-service-db

billing-service-db

🔄 Service Communication:
Synchronous: REST/gRPC

Asynchronous: Kafka topics like:

patient.registered

billing.invoice.created

✅ Project Goals:
Demonstrate modular architecture using microservices

Implement robust and scalable communication using Kafka and gRPC

Ensure secure, real-time patient data processing

Practice infrastructure-as-code with AWS CDK and Docker
